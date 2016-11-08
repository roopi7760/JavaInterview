package csJava;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Iterating {
	public static void main(String []  args)
	{
		CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<String>();
		
		names.add("Roopesh Kumar");
		names.add("Ashika");
		names.add("Manoj");
		names.add("Krishna");
		
		Iterator<String> i = names.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			names.add("Likith");
		}
		i = names.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
	}
}
