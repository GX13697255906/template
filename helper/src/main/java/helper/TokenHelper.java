package helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class TokenHelper {

	public static void main(String[] args) {
		System.out.println(getToken());
	}
	
	
	
	
	public static String getToken() {
		String token = null;
		
		String account = "area_admin";
		String password = "C29886CE992FCB056F84DB3B0EDECD52";
		
		String urlString = "http://dtjc:8889/admin/login/token?username="+ account +"&password=" + password;
		
		HttpURLConnection connection = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		try {
			URL url = new URL(urlString);
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Accept", "application/json, text/plain, */*");
			connection.setRequestProperty("Accept-Charset", "utf-8");
			connection.setRequestProperty("Content-Type","application/json");
			connection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36");
			connection.setDoInput(true);
			connection.setDoOutput(true);
			
			int responseCode = connection.getResponseCode();
			System.out.println(responseCode);
			if(responseCode == HttpURLConnection.HTTP_OK) {
				inputStreamReader = new InputStreamReader(connection.getInputStream(),"UTF-8");
				bufferedReader = new BufferedReader(inputStreamReader);
				StringBuffer stringBuffer = new StringBuffer();
				String line;
				while((line = bufferedReader.readLine()) != null) {
					stringBuffer.append(line);
				}
				String result = stringBuffer.toString();
				JSONObject resultObject = JSON.parseObject(result);
				String success = resultObject.getString("message");
				if("success".equals(success)) {
					JSONObject data = resultObject.getJSONObject("data");
					if(data != null) {
						String access_token = data.getString("access_token");
						String token_type = data.getString("token_type");
						token = token_type + access_token;
						System.out.println(token);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.disconnect();
		}
		return token;
	}

}
