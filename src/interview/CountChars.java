package interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CountChars {

	public void countChar(String message)
	{
		HashMap<Character, Integer> numMap = new HashMap<Character, Integer>();
		for(int i=0; i< message.length(); i++)
		{
			if(numMap.containsKey(message.charAt(i)))
			{
				numMap.put(message.charAt(i), numMap.get(message.charAt(i))+1);
			}
			else
				 numMap.put(message.charAt(i), 1);
		}
		Iterator<Entry<Character, Integer>> i = numMap.entrySet().iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	public static void main(String [] args)
	{
		CountChars ca = new CountChars();
		ca.countChar("RoopeshKumar KrishnaKumar");
		
		
	}
}
