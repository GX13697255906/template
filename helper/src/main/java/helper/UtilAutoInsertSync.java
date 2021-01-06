package helper;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.quartz.JobDataMap;
import org.quartz.utils.DirtyFlagMap;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilAutoInsertSync {


    public static String SCHEMA_NAME;

    public static String JOB_GROUP;

    public static String JOB_CLASS_NAME;

    public static String IS_DURABLE = "0";

    public static String IS_NONCONCURRENT = "0";

    public static String IS_UPDATE_DATA = "0";

    public static String REQUESTS_RECOVERY = "0";

    public static String TRIGGER_GROUP;

    public static String TIME_ZONE_ID;

    public static Long MARKET_ID_EL = 1307965417568268290L;

    public static String MARKET_EL_SYNC_SHEET_NAME = "电能量-数据同步接口";

    public static Long MARKET_ID_FM = 1307965506793697282L;

    public static String MARKET_FM_SYNC_SHEET_NAME = "调频-数据同步接口";

    public static Long MARKET_ID_PR = 1307965544064282626L;

    public static String MARKET_PR_SYNC_SHEET_NAME = "调峰-数据同步接口";

    public static Long USE_MARKET_ID;

    public static String SERVICE_ID_EL = "dms-datasync-client";

    public static String SERVICE_ID_FM = "dms-datasync-client";

    public static String SERVICE_ID_PR = "dms-datasync-client";

    public static String USE_SERVICE_ID;

    public static String GROUP = "3";

    public static Integer HOUR;

    public static String FILE_PATH = "F:\\github\\workspace\\template\\helper\\src\\main\\java\\helper\\数据同步缺表统计.xlsx";

    public static void main(String[] args) {
        List<QrtzJobDetails> list = getDeleteBatch();

//        List<QrtzJobDetails> list2 = addBatchSync();

    }

    private static List<QrtzJobDetails> getDeleteBatch() {
        System.out.println("-------------------批量删除数据同步任务-------------------");
        List<QrtzJobDetails> jobDetailsList = new ArrayList<>();
        List<QrtzCronTriggers> cronTriggersList = new ArrayList<>();
        try {
            Connection connection = DBHelper.getConnection();
            connection.setAutoCommit(false);
            Statement statement = null;
            ResultSet rs = null;
            if (connection == null) {
                return null;
            }
            statement = connection.createStatement();
//            查询 qrtz_job_details
            rs = statement.executeQuery(
                    "SELECT a.* FROM qrtz_job_details a");
            while (rs.next()) {
                Blob blob = rs.getBlob("JOB_DATA");
                String schedName = rs.getString("SCHED_NAME");
                SCHEMA_NAME = SCHEMA_NAME == null ? schedName : SCHEMA_NAME;
                String jobName = rs.getString("JOB_NAME");
                String jobGroup = rs.getString("JOB_GROUP");
                JOB_GROUP = JOB_GROUP == null ? jobGroup : JOB_GROUP;
                String description = rs.getString("DESCRIPTION");
                String jobClassName = rs.getString("JOB_CLASS_NAME");
                JOB_CLASS_NAME = JOB_CLASS_NAME == null ? jobClassName : JOB_CLASS_NAME;
                String isDurable = rs.getString("IS_DURABLE");
                String isNonConcurrent = rs.getString("IS_NONCONCURRENT");
                String isUpdateData = rs.getString("IS_UPDATE_DATA");
                String requestsRecovery = rs.getString("REQUESTS_RECOVERY");
                Map<String, String> data = new HashMap<>();
                try {
                    InputStream is = blob.getBinaryStream();
                    ObjectInputStream ois = new ObjectInputStream(is);
                    try {
                        Object object = ois.readObject();
                        DirtyFlagMap jobDataMap = (DirtyFlagMap) object;
                        data = jobDataMap.getWrappedMap();
                        Long marketId = null;
                        if (jobDataMap.containsKey("marketId")) {
                            marketId = Long.parseLong(jobDataMap.get("marketId").toString());
                        }
                        if (jobName.equals("测试定时任务")) {
                            System.out.println(jobName);
                        }
                        jobDetailsList.add(new QrtzJobDetails(schedName, jobName, jobGroup, description, jobClassName, isDurable, isNonConcurrent, isUpdateData, requestsRecovery, marketId, data));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
//          查询 qrtz_cron_trigger
            rs = statement.executeQuery(
                    "SELECT * FROM qrtz_cron_triggers");
            while (rs.next()) {
                String schedName = SCHEMA_NAME;
                String triggerName = rs.getString("TRIGGER_NAME");
                String triggerGroup = rs.getString("TRIGGER_GROUP");
                TRIGGER_GROUP = TRIGGER_GROUP == null ? triggerGroup : TRIGGER_GROUP;
                String cronExpression = rs.getString("CRON_EXPRESSION");
                String timeZoneId = rs.getString("TIME_ZONE_ID");
                TIME_ZONE_ID = TIME_ZONE_ID == null ? timeZoneId : TIME_ZONE_ID;
                cronTriggersList.add(new QrtzCronTriggers(schedName, triggerName, triggerGroup, cronExpression, timeZoneId));
            }

//          qrtz_triggers
            rs = statement.executeQuery(
                    "SELECT * FROM qrtz_triggers");
            while (rs.next()) {
                try {
                    String triggerType = rs.getString("TRIGGER_TYPE");

                    Blob blob = rs.getBlob("JOB_DATA");
                    Map<String, String> data = new HashMap<>();
                    InputStream is = blob.getBinaryStream();
                    if (is.read() != -1) {
                        ObjectInputStream ois = new ObjectInputStream(is);
                        Object object = ois.readObject();
                        DirtyFlagMap jobDataMap = (DirtyFlagMap) object;
                        data = jobDataMap.getWrappedMap();
                        System.out.println(data);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            List<UrlAndName> urlAndNameList = null;
            File file = new File(FILE_PATH);
            ExcelReader excelReader = ExcelUtil.getReader(file);
            List<Sheet> sheetList = excelReader.getSheets();
            for (int i = 0; i < sheetList.size(); i++) {
                String sheetName = sheetList.get(i).getSheetName();

                if (sheetName.equals(MARKET_EL_SYNC_SHEET_NAME)) {
                    USE_MARKET_ID = MARKET_ID_EL;
                    USE_SERVICE_ID = SERVICE_ID_EL;
                    HOUR = 8;
                    urlAndNameList = new ArrayList<>();
                }
                if (sheetName.equals(MARKET_FM_SYNC_SHEET_NAME)) {
                    USE_MARKET_ID = MARKET_ID_FM;
                    USE_SERVICE_ID = SERVICE_ID_FM;
                    HOUR = 8;
                    urlAndNameList = new ArrayList<>();
                }
                if (sheetName.equals(MARKET_PR_SYNC_SHEET_NAME)) {
                    USE_MARKET_ID = MARKET_ID_PR;
                    USE_SERVICE_ID = SERVICE_ID_PR;
                    HOUR = 8;
                    urlAndNameList = new ArrayList<>();
                }
                if (null != urlAndNameList) {
                    excelReader = ExcelUtil.getReader(file, i);
                    List<List<Object>> contentList = excelReader.read();
                    for (List<Object> content : contentList) {
                        String url = String.valueOf(content.get(0));
                        String name = String.valueOf(content.get(1));
                        urlAndNameList.add(new UrlAndName(url, name));
                    }
                    for (int j = 0; j < urlAndNameList.size(); j++) {
                        UrlAndName urlAndName = urlAndNameList.get(j);
                        String triggerName = urlAndName.getSyncName();
                        System.out.println(triggerName);

                        PreparedStatement qrtz_cron_triggers_del = connection.prepareStatement("delete from qrtz_cron_triggers where  TRIGGER_NAME = '" + triggerName + "'");
                        qrtz_cron_triggers_del.executeUpdate();

                        PreparedStatement qrtz_triggers_del = connection.prepareStatement("delete from qrtz_triggers where  TRIGGER_NAME = '" + triggerName + "'");
                        qrtz_triggers_del.executeUpdate();

                        PreparedStatement qrtz_job_details_del = connection.prepareStatement("delete from qrtz_job_details where  JOB_NAME = '" + triggerName + "'");
                        qrtz_job_details_del.executeUpdate();

                    }
                    urlAndNameList = null;
                }
            }
            connection.commit();
            DBHelper.close(connection, statement, rs);
        } catch (
                SQLException e) {
            e.printStackTrace();
        } finally {
        }


        return jobDetailsList;
    }


    private static List<QrtzJobDetails> addBatchSync() {
        System.out.println("-------------------批量添加数据同步任务-------------------");
        List<QrtzJobDetails> jobDetailsList = new ArrayList<>();
        List<QrtzCronTriggers> cronTriggersList = new ArrayList<>();
        try {
            Connection connection = DBHelper.getConnection();
            connection.setAutoCommit(false);
            Statement statement = null;
            ResultSet rs = null;
            if (connection == null) {
                return null;
            }
            statement = connection.createStatement();
//            查询 qrtz_job_details
            rs = statement.executeQuery(
                    "SELECT a.* FROM qrtz_job_details a");
            while (rs.next()) {
                Blob blob = rs.getBlob("JOB_DATA");
                String schedName = rs.getString("SCHED_NAME");
                SCHEMA_NAME = SCHEMA_NAME == null ? schedName : SCHEMA_NAME;
                String jobName = rs.getString("JOB_NAME");
                String jobGroup = rs.getString("JOB_GROUP");
                JOB_GROUP = JOB_GROUP == null ? jobGroup : JOB_GROUP;
                String description = rs.getString("DESCRIPTION");
                String jobClassName = rs.getString("JOB_CLASS_NAME");
                JOB_CLASS_NAME = JOB_CLASS_NAME == null ? jobClassName : JOB_CLASS_NAME;
                String isDurable = rs.getString("IS_DURABLE");
                String isNonConcurrent = rs.getString("IS_NONCONCURRENT");
                String isUpdateData = rs.getString("IS_UPDATE_DATA");
                String requestsRecovery = rs.getString("REQUESTS_RECOVERY");
                Map<String, String> data = new HashMap<>();
                try {
                    InputStream is = blob.getBinaryStream();
                    ObjectInputStream ois = new ObjectInputStream(is);
                    try {
                        Object object = ois.readObject();
                        DirtyFlagMap jobDataMap = (DirtyFlagMap) object;
                        data = jobDataMap.getWrappedMap();
                        Long marketId = null;
                        if (jobDataMap.containsKey("marketId")) {
                            marketId = Long.parseLong(jobDataMap.get("marketId").toString());
                        }
                        if (jobName.equals("测试定时任务")) {
                            System.out.println(jobName);
                        }
                        jobDetailsList.add(new QrtzJobDetails(schedName, jobName, jobGroup, description, jobClassName, isDurable, isNonConcurrent, isUpdateData, requestsRecovery, marketId, data));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
//          查询 qrtz_cron_trigger
            rs = statement.executeQuery(
                    "SELECT * FROM qrtz_cron_triggers");
            while (rs.next()) {
                String schedName = SCHEMA_NAME;
                String triggerName = rs.getString("TRIGGER_NAME");
                String triggerGroup = rs.getString("TRIGGER_GROUP");
                TRIGGER_GROUP = TRIGGER_GROUP == null ? triggerGroup : TRIGGER_GROUP;
                String cronExpression = rs.getString("CRON_EXPRESSION");
                String timeZoneId = rs.getString("TIME_ZONE_ID");
                TIME_ZONE_ID = TIME_ZONE_ID == null ? timeZoneId : TIME_ZONE_ID;
                cronTriggersList.add(new QrtzCronTriggers(schedName, triggerName, triggerGroup, cronExpression, timeZoneId));
            }

//          qrtz_triggers
            rs = statement.executeQuery(
                    "SELECT * FROM qrtz_triggers");
            while (rs.next()) {
                try {
                    String triggerType = rs.getString("TRIGGER_TYPE");

                    Blob blob = rs.getBlob("JOB_DATA");
                    Map<String, String> data = new HashMap<>();
                    InputStream is = blob.getBinaryStream();
                    if (is.read() != -1) {
                        ObjectInputStream ois = new ObjectInputStream(is);
                        Object object = ois.readObject();
                        DirtyFlagMap jobDataMap = (DirtyFlagMap) object;
                        data = jobDataMap.getWrappedMap();
                        System.out.println(data);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            List<UrlAndName> urlAndNameList = null;
            File file = new File("F:\\github\\workspace\\template\\helper\\src\\main\\java\\helper\\数据同步缺表统计.xlsx");
            ExcelReader excelReader = ExcelUtil.getReader(file);
            List<Sheet> sheetList = excelReader.getSheets();
            for (int i = 0; i < sheetList.size(); i++) {
                String sheetName = sheetList.get(i).getSheetName();

                if (sheetName.equals(MARKET_EL_SYNC_SHEET_NAME)) {
                    USE_MARKET_ID = MARKET_ID_EL;
                    USE_SERVICE_ID = SERVICE_ID_EL;
                    HOUR = 8;
                    urlAndNameList = new ArrayList<>();
                }
                if (sheetName.equals(MARKET_FM_SYNC_SHEET_NAME)) {
                    USE_MARKET_ID = MARKET_ID_FM;
                    USE_SERVICE_ID = SERVICE_ID_FM;
                    HOUR = 8;
                    urlAndNameList = new ArrayList<>();
                }
                if (sheetName.equals(MARKET_PR_SYNC_SHEET_NAME)) {
                    USE_MARKET_ID = MARKET_ID_PR;
                    USE_SERVICE_ID = SERVICE_ID_PR;
                    HOUR = 8;
                    urlAndNameList = new ArrayList<>();
                }
                if (null != urlAndNameList) {
                    excelReader = ExcelUtil.getReader(file, i);
                    List<List<Object>> contentList = excelReader.read();
                    for (List<Object> content : contentList) {
                        String url = String.valueOf(content.get(0));
                        String name = String.valueOf(content.get(1));
                        urlAndNameList.add(new UrlAndName(url, name));
                    }
                    for (int j = 0; j < urlAndNameList.size(); j++) {
                        UrlAndName urlAndName = urlAndNameList.get(j);
                        String triggerName = urlAndName.getSyncName();
                        System.out.println(triggerName);


                        PreparedStatement qrtz_cron_triggers_del = connection.prepareStatement("delete from qrtz_cron_triggers where  TRIGGER_NAME = '" + triggerName + "'");
                        qrtz_cron_triggers_del.executeUpdate();

                        PreparedStatement qrtz_triggers_del = connection.prepareStatement("delete from qrtz_triggers where  TRIGGER_NAME = '" + triggerName + "'");
                        qrtz_triggers_del.executeUpdate();

                        PreparedStatement qrtz_job_details_del = connection.prepareStatement("delete from qrtz_job_details where  JOB_NAME = '" + triggerName + "'");
                        qrtz_job_details_del.executeUpdate();


//                        添加 qrtz_job_details
                        PreparedStatement preparedStatement_job_detail = connection.prepareStatement("insert into qrtz_job_details values(?,?,?,?,?,?,?,?,?,?)");
                        preparedStatement_job_detail.setString(1, SCHEMA_NAME);
                        preparedStatement_job_detail.setString(2, triggerName);
                        preparedStatement_job_detail.setString(3, JOB_GROUP);
                        preparedStatement_job_detail.setString(4, triggerName);
                        preparedStatement_job_detail.setString(5, JOB_CLASS_NAME);
                        preparedStatement_job_detail.setString(6, IS_DURABLE);
                        preparedStatement_job_detail.setString(7, IS_NONCONCURRENT);
                        preparedStatement_job_detail.setString(8, IS_UPDATE_DATA);
                        preparedStatement_job_detail.setString(9, REQUESTS_RECOVERY);
                        JobDataMap dataMap = new JobDataMap();
                        dataMap.put("path", urlAndName.getUrl());
                        dataMap.put("method", "GET");
                        dataMap.put("createTime", "2020-05-12");
                        dataMap.put("batch", "7批次");
                        dataMap.put("jobGroup", GROUP);
                        dataMap.put("serviceId", USE_SERVICE_ID);
                        dataMap.put("contentType", null);
                        dataMap.put("alarmMail", null);
                        dataMap.put("marketId", String.valueOf(USE_MARKET_ID));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
                            outputStream.writeObject(dataMap);
                            outputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteOut = byteArrayOutputStream.toByteArray();
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteOut);
                            preparedStatement_job_detail.setBinaryStream(10, byteArrayInputStream);
                            preparedStatement_job_detail.executeUpdate();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
//            添加qrtz_triggers
                        PreparedStatement preparedStatement_triggers = connection.prepareStatement("insert into qrtz_triggers values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                        preparedStatement_triggers.setString(1, SCHEMA_NAME);
                        preparedStatement_triggers.setString(2, triggerName);
                        preparedStatement_triggers.setString(3, TRIGGER_GROUP);
                        preparedStatement_triggers.setString(4, triggerName);
                        preparedStatement_triggers.setString(5, JOB_GROUP);
                        preparedStatement_triggers.setString(6, triggerName);
                        preparedStatement_triggers.setString(7, null);
                        preparedStatement_triggers.setString(8, null);
                        preparedStatement_triggers.setInt(9, 5);
                        preparedStatement_triggers.setString(10, "WAITING");
                        preparedStatement_triggers.setString(11, "CRON");
                        preparedStatement_triggers.setLong(12, 1604567418000L);
                        preparedStatement_triggers.setLong(13, 0);
                        preparedStatement_triggers.setString(14, triggerName);
                        preparedStatement_triggers.setInt(15, 2);
                        preparedStatement_triggers.setBinaryStream(16, null);
                        preparedStatement_triggers.executeUpdate();
                        //          添加 qrtz_cron_triggers
                        PreparedStatement preparedStatement_cron_triggers = connection.prepareStatement("insert into qrtz_cron_triggers values(?,?,?,?,?)");
                        preparedStatement_cron_triggers.setString(1, SCHEMA_NAME);
                        preparedStatement_cron_triggers.setString(2, triggerName);
                        preparedStatement_cron_triggers.setString(3, TRIGGER_GROUP);
                        preparedStatement_cron_triggers.setString(4, "0 " + j + " " + HOUR + " * * ?");
                        preparedStatement_cron_triggers.setString(5, TIME_ZONE_ID);
                        preparedStatement_cron_triggers.executeUpdate();
                    }
                    urlAndNameList = null;
                }
            }
            connection.commit();
            DBHelper.close(connection, statement, rs);
        } catch (
                SQLException e) {
            e.printStackTrace();
        } finally {
        }


        return jobDetailsList;
    }


    private static void submit(String token, String uri, String scopeDate) {
        String param = "";
        try {
            param = "scopeDate=" + URLEncoder.encode(scopeDate, "UTF-8");
        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        String urlString = "http://dtjc:8889/biz2x" + uri + "?" + param;

        System.out.println(urlString);

        HttpURLConnection connection = null;
        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json, text/plain, */*");
            connection.setRequestProperty("Accept-Charset", "utf-8");
            connection.setRequestProperty("areaCode", "1");
            connection.setRequestProperty("Authorization", token);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("User-Agent",
                    "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36");
            connection.setDoInput(true);
            connection.setDoOutput(true);

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println(responseCode + ": ִ�гɹ�!");
            } else {
                System.out.println(responseCode + ": ִ��ʧ��, " + uri);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
    }

    private class Task implements Runnable {

        private String token;
        private String uri;
        private String scopeDate;

        public Task(String token, String uri, String scopeDate) {
            this.token = token;
            this.uri = uri;
            this.scopeDate = scopeDate;
        }

        @Override
        public void run() {
            submit(token, uri, scopeDate);

        }

        private void submit(String token, String uri, String scopeDate) {
            String param = "";
            try {
                param = "scopeDate=" + URLEncoder.encode(scopeDate, "UTF-8");
            } catch (UnsupportedEncodingException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            String urlString = "http://dtjc:8889/biz2x" + uri + "?" + param;

            HttpURLConnection connection = null;
            try {
                URL url = new URL(urlString);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Accept", "application/json, text/plain, */*");
                connection.setRequestProperty("Accept-Charset", "utf-8");
                connection.setRequestProperty("areaCode", "1");
                connection.setRequestProperty("Authorization", token);
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("User-Agent",
                        "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36");
                connection.setDoInput(true);
                connection.setDoOutput(true);

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    System.out.println(responseCode + ": ִ�гɹ�!");
                } else {
                    System.out.println(responseCode + ": ִ��ʧ��, " + uri + "|" + connection.getResponseMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                connection.disconnect();
            }
        }

    }
}
