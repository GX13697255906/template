package helper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSyncTaskHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSyncTaskHelper helper = new  DataSyncTaskHelper();
		helper.createOrUpdateSyncTask(false, "bearer989ccb34-6537-4f50-8e00-bf17bfe27d18");
		
	}
	 
	/**
	 * �������������ͬ������
	 * @param flag ��־�Ǵ������񣬻��Ǹ�������true:�ֽ�����false:��������
	 * @param token ����ϵͳ�����tokenֵ
	 */
	public void createOrUpdateSyncTask(boolean flag, String token) {
		String urlString = "http://dtjc:8889/task/job/add/http";
		if(!flag) {
			urlString = "http://dtjc:8889/task/job/update/http";
		}
		
		Connection conn = DBHelper.getConnection();
		Statement statement = null;
		ResultSet rs = null;
		if(conn == null) return;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery("SELECT * FROM base_api where path like '%job/push%'");
		
			int second = 0;
			int min = 1;
			int hour = 7;
			int i = 0;
			while(rs.next()) {
				String jobName = "";
				String name = rs.getString("api_name");
				String path = rs.getString("path");
				
				
				
				String firstName = name.split(" ")[0];
				String secondName = name.split(" ")[1];
				
				if(secondName.contains("��")) {
					jobName = "����ͬ��-" + firstName + "-ÿ��";
				}else if(secondName.contains("��")) {
					jobName = "����ͬ��-" + firstName + "-ÿ��";
				}else if(secondName.contains("��")) {
					jobName = "����ͬ��-" + firstName + "-ÿ��";
				}else if(secondName.contains("��")) {
					jobName = "����ͬ��-" + firstName + "-ÿ��";
				}else if(secondName.contains("ʱ")) {
					jobName = "����ͬ��-" + firstName + "-ÿСʱ";
				}else if(secondName.contains("��")) {
					jobName = "����ͬ��-" + firstName + "-ÿ��";
				}else {
					jobName = "����ͬ��-" + firstName;
				}
				
				if(path.contains("UnitOutputActual")) {
					jobName = "����ͬ��-����ʵ�ʳ�����";
				}
				
				if(path.contains("PowerPlantRegisterInfo")) {
					jobName = "����ͬ��-�糧ע����Ϣ��";
				}
				
				if(path.contains("MarketNodeElePriceDayAhead")) {
					jobName = "����ͬ��-����ͬ��-��ǰ�г��ڵ�����Ϣ��";
				}
				
				if(path.contains("UnitMarketResultActual")) {
					jobName = "����ͬ��-�����ʵʱ�г���������ʽ��";
				}
				
				if(path.contains("UnitParamRegisterInfo")) {
					jobName = "����ͬ��-����ע����Ϣ��";
				}
				
				if(second == 60) {
					second = 0;
					min = min + 1;
				}
				
				if(min == 60) {
					min = 0;
					hour = hour + 1;
				}
				
				String cron = second  + " " + min + " " + hour + " " + "* * ?";
				
				String urlParams = getUrlParams(jobName, path, cron);
				
				String url = urlString + "?" + urlParams;
				
				System.out.println("jobName: " + jobName);
				submit(token, url);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				second = second + 6;
				i++;
				//System.out.println(name + ": " + jobName);
				
			}
			System.out.println("�����������Ϊ: " + i);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			DBHelper.close(conn, statement, rs);
		}
		
	}
	
	private void submit(String token, String urlString) {
		HttpURLConnection connection = null;
		try {
			URL url = new URL(urlString);
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Accept", "application/json, text/plain, */*");
			connection.setRequestProperty("Accept-Charset", "utf-8");
			connection.setRequestProperty("areaCode","1");
			connection.setRequestProperty("Authorization",token);
			connection.setRequestProperty("Content-Type","application/json");
			connection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36");
			connection.setDoInput(true);
			connection.setDoOutput(true);
			
			int responseCode = connection.getResponseCode();
			System.out.println( "responseCode: " + responseCode);
			if(responseCode == HttpURLConnection.HTTP_OK) {
				InputStream is = connection.getInputStream();
				InputStreamReader isr = new InputStreamReader(is,"UTF-8");
				BufferedReader reader = new BufferedReader(isr);
				StringBuffer sb = new StringBuffer();
				String line;
				while((line = reader.readLine()) != null) {
					sb.append(line);
				}
				if(sb.toString().contains("success")) {
					System.out.println("���³ɹ�!");
				}
				isr.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.disconnect();
		}
	}
	
	private String getUrlParams(String jobName, String path, String cron) {
		String formLayout = ""; 
		//String jobName = "����ͬ��-�߽���Ϣ��¶ʱ���";
		String jobType = "cron";
		String jobDescription = ""; 
		String jobGroup = "3";
		String batch = "";
		//String cron = "0 0 16 * * ?";
		String alarmMail = ""; 
		String repeatCount="0";
		String serviceId = "dms-datasync-client";
		//String path = "/base/job/push/syncBoundaryDisclosureTime";
		String contentType =""; 
		String method = "GET";
		
		try {
			jobName =  URLEncoder.encode(jobName,"UTF-8");
			cron =  URLEncoder.encode(cron,"UTF-8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "formLayout=" + formLayout +
				"&jobName=" + jobName +
				"&jobType=" + jobType +
				"&jobDescription="+jobDescription +
				"&jobGroup=" + jobGroup +
				"&batch=" + batch +
				"&cron=" + cron +
				"&alarmMail=" + alarmMail +
				"&repeatCount=" + repeatCount +
				"&serviceId=" + serviceId +
				"&path=" + path + 
				"&contentType=" + contentType +
				"&method=" + method;
	}
}
