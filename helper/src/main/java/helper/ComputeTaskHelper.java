package helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.quartz.JobDataMap;

/**
 * 批量更新计算任务
 */
public class ComputeTaskHelper {

	public static void main(String[] args) {
		ComputeTaskHelper helper = new ComputeTaskHelper();
		helper.updateComputeTask("bearerf01930ab-7692-4ef9-b249-93deeb63c718");
	}
	
	
	public void updateComputeTask(String token) {
		String urlString = "http://dtjc:8889/task/job/update/http";
		
		Connection conn = DBHelper.getConnection();
		Statement statement = null;
		ResultSet rs = null;
		if(conn == null) return;
		
		
		int hour = 6;
		
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery("SELECT a.* FROM qrtz_job_details a,qrtz_triggers b where a.JOB_NAME=b.JOB_NAME and a.DESCRIPTION in ('1','2','3','4','5') and b.TRIGGER_STATE<>'PAUSED'");
			while(rs.next()) {
				int min = 10;
				Blob blob = rs.getBlob("JOB_DATA");
				InputStream is = blob.getBinaryStream();
				String jobName = rs.getString("JOB_NAME");
				String description = rs.getString("DESCRIPTION");
				System.out.println("jobName: " + jobName);
				
				try {
					ObjectInputStream ois = new ObjectInputStream(is);
					try {
						Object object = ois.readObject();
						JobDataMap dataMap = (JobDataMap)object;
						String path = dataMap.getString("path");
						String batch = dataMap.getString("batch");
						String jobGroup = dataMap.getString("jobGroup");
						
						String cron = "";
						
						if("2批次".equals(batch)) {
							min = min + 1;
						}
						
						if("3批次".equals(batch)) {
							min = min + 2;
						}
						
						if("4批次".equals(batch)) {
							min = min + 3;
						}
						
						if("5批次".equals(batch)) {
							min = min + 4;
						}
						
						if(min == 60) {
							min = 0;
							hour = hour + 1;
						}
						cron = "0 " + min + " " + hour + " " + "* * ?";
						
						try {
							jobName =  URLEncoder.encode(jobName,"UTF-8");
							batch = URLEncoder.encode(batch,"UTF-8");
							cron =  URLEncoder.encode(cron,"UTF-8");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						String urlParams = "formLayout=" +
								"&jobName=" + jobName +
								"&jobType=" + "cron" +
								"&jobDescription="+description +
								"&jobGroup=" + jobGroup +
								"&batch=" + batch +
								"&cron=" + cron +
								"&alarmMail=" +
								"&repeatCount=0" +
								"&serviceId=dms-biz2x-server" +
								"&path=" + path + 
								"&contentType=" +
								"&method=GET";
						String url = urlString + "?" + urlParams;
						submit(token, url);
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
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
					System.out.println("更新成功!");
				}
				isr.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.disconnect();
		}
	}
}
