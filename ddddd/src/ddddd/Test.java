package ddddd;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Test {
	 public static void main(String[] args) throws IOException {
		 try {
	URL url = new URL("https://www.koreaexim.go.kr/site/program/financial/exchangeJSON");
	HttpURLConnection con = (HttpURLConnection) url.openConnection();
	con.setRequestMethod("GET");
	
	Map<String, String> parameters = new HashMap<>();
	parameters.put("authkey", "wu4z4qw9YE2LzsAqgg1vkLuIRRrsjrYc");
	parameters.put("searchdate", "20181116");
	parameters.put("data", "AP01");
		 
	 }
}

}
