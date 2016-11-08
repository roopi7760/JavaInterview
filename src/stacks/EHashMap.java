package stacks;

import java.util.HashMap;

public class EHashMap {
	
	public static void main(String args[])
	{
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3,"Three");
		hm.put(4,"Four");
		hm.put(5,"Five");
		hm.merge(5, "Six", String::concat);
		
		
		
		System.out.println(hm.get(5));
		
	}

}
