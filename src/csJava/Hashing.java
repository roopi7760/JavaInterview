package csJava;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashing {

	public static void main(String [] args)
	{
		Hashtable<Integer, Integer> ht= new Hashtable<Integer, Integer>();
		int[] a = {1,2,3,4,5,4,5,3,2,1,4};
		int[] b = {1,2,3,4,5,4,3,2,1,4};
		boolean notSame =true;
		for(int i=0; i< a.length; i++)
		{
			if(ht.containsKey(a[i]))
			{
				int temp = ht.get(a[i]);
				temp+=1;
				ht.put(a[i], temp);
			}
			else
			ht.put(a[i], 1);
		}

		for(int i=0; i<b.length;i++)
		{
			if(ht.containsKey(b[i]))
			{
				int temp = ht.get(b[i]);
				ht.put(b[i], --temp);
			}
		}
		
		
Iterator<Entry<Integer, Integer>> k = ht.entrySet().iterator();
		
		Integer aa ;
		while(k.hasNext())
		{
			//System.out.println(k.next().getValue());
			
			if(k.next().getValue()!=0)
			{
				notSame = false;
				break;
			}
		}
		
		if(notSame)
		System.out.println("Two arrays are same");
		else
			System.out.println("Two arrays are not same");
	}
	
}
