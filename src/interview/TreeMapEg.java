package interview;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEg {

	public static void main(String [] args)
	{
		TreeMap<Integer, String> names = new TreeMap<Integer, String>();
		
		names.put(1,  "Roopesh Kumar");
		names.put(23,  "Ashika");
		names.put(12, "Sukanya");
		names.put(8, "Krishna");
		TreeMap<Integer, String> names2 = (TreeMap<Integer, String>) names.clone();
		Iterator<Entry<Integer, String>> i = names.entrySet().iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		names2.put(8, "Ajay");
		
		i = names2.entrySet().iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
