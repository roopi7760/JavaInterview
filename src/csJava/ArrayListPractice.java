package csJava;

import java.util.ArrayList;

public class ArrayListPractice {

	public void append(ArrayList<String> target, ArrayList<String> source)
	{
	 for (int i = 0; i < source.size(); i++)
	 {
	 target.add(source.get(i));
	 }
	}
	public static void main(String [] args)
	{
		ArrayListPractice a = new ArrayListPractice();
		ArrayList<String> names1 = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>();
		names1.add("Emily");
		names1.add("Bob");
		names1.add("Cindy");
		names2.add("Dave");
		a.append(names1, names2);
		a.append(names2, names1);
		System.out.println("Contents of names1 after append: " + names1);
		System.out.println("Contents of names2 after append: " + names2);
	}
}
