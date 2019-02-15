package com.my.cjava;
import java.io.BufferedReader;
import java.util.Scanner;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Practice_OpenAPi {
	/*
	 *	Reference : https://www.baeldung.com/java-http-request
	 *	Class : HttpUrlConnection
	 */	
	public static void main(String[] args) throws IOException {
		
		Openapi api1 = new Openapi();
		api1.Time2("20181116");
	}
	class Openapi {
		private String Time;
		
		public Openapi() {
			this.Time = "";
			
	}
		public void Time2(String Day) {
			URL url = new URL("https://www.koreaexim.go.kr/site/program/financial/exchangeJSON");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			
			// 2. HTTP ��ü�� Request Parameters �߰�
			Map<String, String> parameters = new HashMap<>();
			parameters.put("authkey", "wu4z4qw9YE2LzsAqgg1vkLuIRRrsjrYc"); // ����Ű
			parameters.put("searchdate", Day);// ��¥
			//parameters.put("searchdate", command);
			parameters.put("data", "AP01");
		}
	try {

			Scanner SS = new Scanner(System.in);
			String command = SS.next();
			
			//System.out.println(command);
			// 1. HTTP ��ü
			URL url = new URL("https://www.koreaexim.go.kr/site/program/financial/exchangeJSON");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			
			// 2. HTTP ��ü�� Request Parameters �߰�
			Map<String, String> parameters = new HashMap<>();
			parameters.put("authkey", "wu4z4qw9YE2LzsAqgg1vkLuIRRrsjrYc"); // ����Ű
			parameters.put("searchdate", "20181116");// ��¥
			//parameters.put("searchdate", command);
			parameters.put("data", "AP01");			// ��ûŸ��
			
			// 3. HTTP ��ü�� Write(����) ��� ����
			con.setDoOutput(true); 
			DataOutputStream out = new DataOutputStream(con.getOutputStream());
			out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
			out.flush();
			out.close();
						
			// 4. HTTP ��ü�� �߰� ���� (i.e. ���� ��� �ð�, ���� �б� �ð�)
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000); 
			
			// 5. HTTP ��ü�� �б�
			int status = con.getResponseCode();
			String data = null;
			if(status == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer content = new StringBuffer();
				while ((inputLine = in.readLine()) != null) {
				    content.append(inputLine);
				}
				data = content.toString();
				in.close();			
			}
			
			con.disconnect();
			
			System.out.println(data);


			JsonParser parser = new JsonParser();
			
			JsonArray arr = (JsonArray) parser.parse(data);
		
			String[] aa = new String[100];
			
			for(int i=0; i<arr.size(); i++) {
				JsonObject obj = (JsonObject) arr.get(i);
				String name = obj.get("cur_unit").getAsString();
				
				aa[i] = name;
				System.out.print(name + " ");
				// System.out.println(name  + " : " + obj.get("deal_bas_r").getAsString());
				
				if(i == arr.size() - 1) {

					System.out.println("\n환율단위 입력");
					String command2 = SS.next();
					
					for(int j = 0; i>j; j++) {
					if(aa[j].equals(command2)) {
					System.out.println(aa[j]  + " : " + obj.get("deal_bas_r").getAsString());
					}
					}
				}
				
			}
		
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	}
	


