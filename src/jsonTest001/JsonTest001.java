package jsonTest001;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.*;
//import java.util.LinkedList;
//import java.util.List;


public class JsonTest001 {
		
	
	public static void main(String[] args){
		JSONObject obj1 = new JSONObject();
		
		
		try{
			FileWriter file = new FileWriter("d:\\test.json");
			
			obj1.put("name", "vinyarsv");
			obj1.put("sec_name", "Vinyarskyy Volodymyr");
			
			JSONArray list = new JSONArray();
			list.add("DL_UA02");
			list.add("UA02_IT");
		
			obj1.put("groups", list);
		
		
			//FileWriter file = new FileWriter("d:\\test.json");
			file.write(obj1.toJSONString());
			//file.flush();
			//file.close();
			
		
		obj1.put("name", "balakhtr");
		obj1.put("sec_name", "Balakhtar Roman");
		
		list.clear();
		list.add("DL_UA02");
		list.add("UA02_IT");
		
		obj1.put("groups", list);
		
		
		
			file.write(obj1.toJSONString());
			file.flush();
			file.close();
			
		}catch (IOException e){
			e.printStackTrace();
		}
		
		
	}
	
}
