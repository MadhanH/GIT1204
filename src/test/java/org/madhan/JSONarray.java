package org.madhan;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONarray {
	
	public static void main(String[] args) throws IOException, ParseException {
		
FileReader  reader = new FileReader("C:\\Users\\SATHISH\\eclipse-workspace\\API\\src\\test\\resources\\JSON Files\\day2.JSON");
		
		JSONParser jsonParser = new JSONParser();
		
		Object obj = jsonParser.parse(reader);
		
		JSONObject jsonObject = (JSONObject) obj;
		
		Object Data = jsonObject.get("data");
	}

}
