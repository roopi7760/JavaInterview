package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

public class HashMapArrayList {

	public static void main(String [] args)
	{
		TreeSet<String> kar = new TreeSet<String>();
		TreeSet<String> and = new TreeSet<String>();
		TreeSet<String> tam = new TreeSet<String>();
		kar.add("Mysore");
		kar.add("Bangalore");
		and.add("Hyderabad");
		and.add("Vishakapatanam");
		tam.add("Chennai");
		tam.add("Madras");
		
		HashMap<String, TreeSet<String>> h = new HashMap<String, TreeSet<String>>();
		
		h.put("Karnataka", kar);
		h.put("Andhra", and);
		h.put("TamilNadu", tam);
		
		/*
		Iterator<Entry<String,ArrayList<String>>> i = h.entrySet().iterator();
		while(i.hasNext())
		{
			Entry<String,ArrayList<String>> e = i.next();
			System.out.println("\nState: " + e.getKey());
			System.out.print( "Cities:");
			for(String str:e.getValue())
				System.out.print(str + "   ");
		}
		*/
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of the city");
		String city = in.next();
		boolean found = false;
		Iterator<Entry<String,TreeSet<String>>> i = h.entrySet().iterator();
		while(i.hasNext())
		{
			Entry<String,TreeSet<String>> e = i.next();
			if(e.getValue().contains(city))
			{
				found =true;
				System.out.println(city + " is in State " + e.getKey());
			}
		}
		if(!found)
			System.out.println("City you entered cannot be found");
		
	}
}
