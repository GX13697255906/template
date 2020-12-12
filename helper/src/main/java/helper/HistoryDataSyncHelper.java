package helper;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class HistoryDataSyncHelper {

	public static void main(String[] args) {

//		String token = TokenHelper.getToken() ;
//
//		for(int i=11;i < 19;i++) {
//			String day = String.valueOf(i);
//			if(i < 10) {
//				day = "0" + day;
//			}
//			System.out.println("2020-09-" + day);
//			String date = "2020-09-" + day;
//			
//			HistoryDataSyncHelper helper = new HistoryDataSyncHelper();
//			helper.executeTask(token, date);
//
//			try {
//				Thread.sleep(3*60*1000 + 6* 1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		String token = "bearer989ccb34-6537-4f50-8e00-bf17bfe27d18";
		if (token != null) {
			String date = "2020-07-09";

			String uri = "/base/web/push/syncPowerPlantRegisterInfo";

			HistoryDataSyncHelper helper = new HistoryDataSyncHelper();
//			helper.executeTask(token, date);
			List<String> path = Arrays.asList(uri);
			helper.executeTask(token, path, date);

//			String uri = "http://20.89.243.44:8889/biz108/price/map";
//			int i = 1;
//			for (; i < 32; i++) {
//				String d = String.valueOf(i);
//				if (d.length() == 1) {
//					d = "0" + d;
//				}
//				String dateStr = "2020-08-" + d;
//				String param = "date="+dateStr+"&dayType=2";
//				String result = helper.getData(token, uri, param);
//				System.out.print(result);
//				JSONObject obj = JSONObject.parseObject(result);
//				obj = obj.getJSONObject("data");
//				JSONArray arr = obj.getJSONArray("data");

//				String aveNodePriceDay = obj.getString("aveNodePriceDay");
//				String maxPriceDay = obj.getString("maxPriceDay");
//				String minPriceDay = obj.getString("minPriceDay");
//				System.out.println(dateStr + "," + aveNodePriceDay + "," + maxPriceDay + "," + minPriceDay + ",");

//				for (int r = 0; r < arr.size(); r++) {
//					JSONObject data = arr.getJSONObject(r);
//
//					String powerPlantName = data.getString("powerPlantName");
//					String unitName = data.getString("unitName");
//					String value = data.getString("value");
//					System.out.println(dateStr + "," + powerPlantName + "," + unitName + "," + value + ",");
//
//				}
//			}
		}
	}

//	
// 供需平衡
//	public static void main(String[] args) {
//
//		String token = "bearer998af09e-4f2a-4468-b7ce-f0aa20b349f6";
//		if (token != null) {
//			String date = "2020-09-06";
////			
//			HistoryDataSyncHelper helper = new HistoryDataSyncHelper();
////			helper.executeTask(token, date);
//
//			String uri = "http://20.89.243.44:8889/biz105/supplyDemandBalancePriceRank";
//			int i = 1;
//			for (; i < 32; i++) {
//				String d = String.valueOf(i);
//				if (d.length() == 1) {
//					d = "0" + d;
//				}
//				String dateStr = "2020-08-" + d;
//				String param = "searchType=1&date=" + dateStr + "&month=&year=2020";
//				String result = helper.getData(token, uri, param);
////				System.out.print(result);
//				JSONObject obj = JSONObject.parseObject(result);
//				obj = obj.getJSONObject("data");
//				JSONArray arr = obj.getJSONArray("waLineList");
//				JSONArray datList = obj.getJSONArray("datList");
//				for (int r = 0; r < arr.size(); r++) {
//					JSONObject data = arr.getJSONObject(r);
//
//					String powerActualPrice = data.getString("powerActualPrice");
//					String powerAheadPrice = data.getString("powerAheadPrice");
//					String dateTime = data.getString("dateTime");
//					String userActualPrice = data.getString("userActualPrice");
//					String userAheadPrice = data.getString("userAheadPrice");
//
//					String price = "";
//					for (int k = 0; k < datList.size(); k++) {
//						JSONObject priceObj = datList.getJSONObject(k);
//
//						String time = priceObj.getString("time");
//						if (dateTime.equals(time)) {
//							price = priceObj.getString("price");
//						}
//					}
//
//					System.out.println(dateStr + "," + dateTime + "," + powerActualPrice + "," + powerAheadPrice + ","
//							+ userActualPrice + "," + userAheadPrice + "," + price);
//
//				}
//			}
//		}
//	}

// 首页电价
//	String token = "bearer32ca14a1-67fb-4ef5-94a3-26593665e48b";
//	if (token != null) {
//		String date = "2020-09-06";
////		
//		HistoryDataSyncHelper helper = new HistoryDataSyncHelper();
////		helper.executeTask(token, date);
//
//		String uri = "http://20.89.243.44:8889/biz108/price/map";
//		int i = 1;
//		for (; i < 32; i++) {
//			String d = String.valueOf(i);
//			if (d.length() == 1) {
//				d = "0" + d;
//			}
//			String dateStr = "2020-08-" + d;
//			String param = "date="+dateStr+"&dayType=2";
//			String result = helper.getData(token, uri, param);
//			System.out.print(result);
//			JSONObject obj = JSONObject.parseObject(result);
//			obj = obj.getJSONObject("data");
////			JSONArray arr = obj.getJSONArray("data");
//			
//			
//			String aveNodePriceDay = obj.getString("aveNodePriceDay");
//			String maxPriceDay = obj.getString("maxPriceDay");
//			String minPriceDay = obj.getString("minPriceDay");
//			System.out.println(dateStr + "," + aveNodePriceDay + "," + maxPriceDay + "," + minPriceDay + ",");
//
////			for (int r = 0; r < arr.size(); r++) {
////				JSONObject data = arr.getJSONObject(r);
////
////				String powerPlantName = data.getString("powerPlantName");
////				String unitName = data.getString("unitName");
////				String value = data.getString("value");
////				System.out.println(dateStr + "," + powerPlantName + "," + unitName + "," + value + ",");
////
////			}
//		}
//	}

// 报价加成指数
//	String uri = "http://20.89.243.44:8889/biz106/avePriceTopDetail";
//	int i = 1;
//	for (; i < 32; i++) {
//		String d = String.valueOf(i);
//		if (d.length() == 1) {
//			d = "0" + d;
//		}
//		String dateStr = "2020-08-" + d;
//		String param = "scopeDate="+dateStr+"&area=&type=1&powerPlantName=";
//		String result = helper.getData(token, uri, param);
//		System.out.print(result);
//		JSONObject obj = JSONObject.parseObject(result);
////		obj = obj.getJSONObject("data");
//		JSONArray arr = obj.getJSONArray("data");
//		for (int r = 0; r < arr.size(); r++) {
//			JSONObject data = arr.getJSONObject(r);
//
//			String powerPlantName = data.getString("powerPlantName");
//			String unitName = data.getString("unitName");
//			String value = data.getString("value");
//			System.out.println(dateStr + "," + powerPlantName + "," + unitName + "," + value + ",");
//
//		}
//	}

//	市场与核定电价分析
//	if (token != null) {
//		String date = "2020-09-06";
////		
//		HistoryDataSyncHelper helper = new HistoryDataSyncHelper();
////		helper.executeTask(token, date);
//
//		String uri = "http://20.89.243.44:8889/biz107/performance/rank/list";
//		int i = 1;
//		for (; i < 32; i++) {
//			String d = String.valueOf(i);
//			if (d.length() == 1) {
//				d = "0" + d;
//			}
//			String dateStr = "2020-08-" + d;
//			String param = "type=1&scopeDate="+dateStr;
//			String result = helper.getData(token, uri, param);
////			System.out.print(result);
//			JSONObject obj = JSONObject.parseObject(result);
////			obj = obj.getJSONObject("data");
//			JSONArray arr = obj.getJSONArray("data");
//			for (int r = 0; r < arr.size(); r++) {
//				JSONObject data = arr.getJSONObject(r);
//
//				String buyPowerMinus = data.getString("buyPowerMinus");
//				String electricityPrice = data.getString("electricityPrice");
//				String internetRariffPrice = data.getString("internetRariffPrice");
//				String powerAndNodeMinus = data.getString("powerAndNodeMinus");
//				String powerAndNodeRate = data.getString("powerAndNodeRate");
//				String tariffMinus = data.getString("tariffMinus");
//				String tariffRate = data.getString("tariffRate");
//				String time = data.getString("time");
//				String userMarketAveragePrice = data.getString("userMarketAveragePrice");
//				String wacPrice = data.getString("wacPrice");
//
//				System.out.println(dateStr + "," + time + "," + buyPowerMinus + "," + electricityPrice + ","
//						+ internetRariffPrice + "," + powerAndNodeMinus + "," + powerAndNodeRate + ","+ tariffMinus + ","
//						+ tariffRate + ","
//						+ userMarketAveragePrice + ","
//						+ wacPrice + ",");
//
//			}
//		}
//	}

	// 机组报价分布
//	String uri = "http://20.89.243.44:8889/biz109/unitDeclarationAnalysisInfo";
//	int i = 1;
//	for (; i < 32; i++) {
//		String d = String.valueOf(i);
//		if (d.length() == 1) {
//			d = "0" + d;
//		}
//		String dateStr = "2020-08-" + d;
//		String param = "date=" + dateStr + "&unitType=";
//		String result = helper.getData(token, uri, param);
////		System.out.print(result);
//		JSONObject obj = JSONObject.parseObject(result);
//		obj = obj.getJSONObject("data");
//		JSONArray arr = obj.getJSONArray(dateStr);
//		for (int r = 0; r < arr.size(); r++) {
//			JSONObject data = arr.getJSONObject(r);
//
//			String dateTime = data.getString("dateTime");
//			String segmentBid = data.getString("segmentBid");
//			String segmentTerminalCapacity = data.getString("segmentTerminalCapacity");
//
//			JSONArray valList = data.getJSONArray("valList");
//
//			System.out.println(dateTime + "," + segmentBid + "," + segmentTerminalCapacity);
//
//		}
//	}
//}

	// 批发用户偏差率
//	String uri = "http://20.89.243.44:8889/biz102/date/deviation";
//	int i = 1;
//	for (; i < 32; i++) {
//		String dateStr = "2020-08-" + i;
//		String param = "areaCode=&date=" + dateStr + "&dateType=1&subjectTypeInt=0&subjectCode=";
//		String result = helper.getData(token, uri, param);
////		System.out.print(result);
//		JSONObject obj = JSONObject.parseObject(result);
////		obj = obj.getJSONObject("data");
//		JSONArray arr = obj.getJSONArray("data");
//		for (int r = 0; r < arr.size(); r++) {
//			JSONObject data = arr.getJSONObject(r);
//
//			String dateTime = data.getString("date");
//			String time = data.getString("time");
//
//			JSONArray valList = data.getJSONArray("valList");
//			
//			System.out.print(dateStr + "," + dateTime + "," + time + ",");
//			for (int k = 0; k < valList.size(); k++) {
//				JSONObject data1 = valList.getJSONObject(k);
//				String value = data1.getString("value");
//				System.out.print(value+",");
//			}
//
//			System.out.println("");
//		}
//	}
//}

	private void executeTask(String token, String date) {
		List<String> paths = getPaths();
		executeTask(token, paths, date);

	}

	private void executeTask(String token, List<String> paths, String date) {

		if (paths != null) {
			for (String uri : paths) {
				Task task = new Task(token, uri, date);
				Thread thread = new Thread(task);
				thread.start();
				try {
					Thread.sleep(2 * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	private static List<String> getPaths() {
		List<String> paths = new ArrayList<String>();
		Connection conn = DBHelper.getConnection();
		Statement statement = null;
		ResultSet rs = null;
		if (conn == null)
			return null;
		try {
			statement = conn.createStatement();
			rs = statement
					.executeQuery("SELECT * FROM base_api where path like '%web/push%' or path like '%web/upload%'");
			while (rs.next()) {
				String name = rs.getString("api_name");
				String path = rs.getString("path");
				paths.add(path);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.close(conn, statement, rs);
		}
		return paths;
	}

	private class Task implements Runnable {

		private String token;
		private String uri;
		private String date;

		public Task(String token, String uri, String date) {
			this.token = token;
			this.uri = uri;
			this.date = getDate(uri, date);
		}

		private String getDate(String uri, String date) {
			if (uri.contains("Year")) {
				return date.split("-")[0];
			}
			return date;
		}

		@Override
		public void run() {
			submit(token, uri, date);

		}

		private void submit(String token, String uri, String date) {
			String param = "";
			try {
				param = "scopeDate=" + URLEncoder.encode(date, "UTF-8");
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String urlString = "http://dtjc:8889/sync" + uri + "?" + param;

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
					System.out.println(responseCode + ": 执行成功!");
				} else {
					System.out.println(responseCode + ": " + uri);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.disconnect();
			}
		}

	}

	private static void submit(String token, String uri, String date) {
		String param = "";
		try {
			param = "scopeDate=" + URLEncoder.encode(date, "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String urlString = "http://dtjc:8889/sync" + uri + "?" + param;

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
			System.out.println(responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK) {
				System.out.println("执行成功!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
	}

	public String getData(String token, String uri, String param) {
//		String param = "";
//		try {
//			param =  URLEncoder.encode(param,"UTF-8");
//		} catch (UnsupportedEncodingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		String urlString = uri + "?" + param;

		HttpURLConnection connection = null;
		try {
			System.out.println("请求开始");
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

//			System.out.println(connection.getResponseMessage());

			if (responseCode == HttpURLConnection.HTTP_OK) {

//				System.out.println(responseCode + ": 执行成功!");
				try {
					BufferedInputStream bis = null;
//					;
					bis = new BufferedInputStream(connection.getInputStream());

					int len = bis.available();
					byte[] b = new byte[len];

					bis.read(b, 0, len);

					return new String(b);
//					System.out.println();
				} catch (Exception e) {
					e.getStackTrace();
				} finally {

				}

			} else {
				System.out.println(responseCode + ": " + uri);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
		return null;
	}

}
