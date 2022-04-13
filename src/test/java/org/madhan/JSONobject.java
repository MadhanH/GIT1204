package org.madhan;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONobject {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader  reader = new FileReader("C:\\Users\\SATHISH\\eclipse-workspace\\API\\src\\test\\resources\\JSON Files\\day1.JSON");
		
		JSONParser jsonParser = new JSONParser();
		
		Object obj = jsonParser.parse(reader);
		
		JSONObject jsonObject = (JSONObject) obj;
		
		Object Data = jsonObject.get("data");
		
		JSONObject j = (JSONObject) Data;
		Object id = j.get("id");
		Object email = j.get("email");
		Object firstName = j.get("first_name");
		Object lastName = j.get("last_name");
		Object avatar = j.get("avatar");
		
		System.out.println(id);
		System.out.println(email);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(avatar);
		
		Object support = jsonObject.get("support");
		
		JSONObject js = (JSONObject) support;
	     
		Object url = js.get("url");
		Object text = js.get("text");
		
		System.out.println(url);
		System.out.println(text);

		
		
		
		
	

		
	}

}
