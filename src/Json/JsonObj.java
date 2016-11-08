/*package Json;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.*;
import org.json.simple.parser.*;

public class JsonObj {
static String json = "{a:{b:{c:{d:{name:'Shreyas', place:'Mysore'}}}}}";

public static void main(String args[])
{
	String key;
	try{
	System.out.println("Original String: " + json);
	JSONObject jObject  = new JSONObject(json);
	
	JSONObject res = jObject;
	while (true){
		Iterator keys = res.keys();	
		    key = (String) keys.next();
		    if(!(res.get(key) instanceof JSONObject))
		    	break;
		    else
			res = (JSONObject) res.get(key);
	}
	
	Iterator keys = res.keys();
	List<String> keysList = new ArrayList<String>();
	while(keys.hasNext()) {
	     key = (String) keys.next();
	     keysList.add(key);
	}	
	for(int i=0;i<keysList.size();i++)
	{
		System.out.println("key: " + keysList.get(i) + "  Value: " + res.get(keysList.get(i)));
	}
	}
	catch(JSONException e){
		System.out.println(e);
	}
}
}
*/