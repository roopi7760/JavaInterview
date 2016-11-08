package interview;


import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class LambdaExpression {

	public static void main(String [] args)
	{
		Scanner in= new Scanner(System.in);
		
		in.next();
		CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList();
		names.add("Roopesh Kumar");
		names.add("Sukanya");
		names.add("Krishna Kumar");
		Thread t1 = new Thread(){
			
			public void run()
			{
				try{
				Iterator<String> i = names.iterator();
				
				while(i.hasNext())
				{
					System.out.println(i.next());
					Thread.sleep(500);
				}
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread()
				{
					public void run()
					{
						try{
							Thread.sleep(2000);
							names.add("Ashika");
							System.out.println(names);
							
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				};
				
				t1.start();
				t2.start();
	}
}



