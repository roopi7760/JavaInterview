package produceconsume;

import java.util.ArrayList;

public class ProduceConsumeSolution {

	public static void main(String [] str)
	{
		int size = 4;
		ArrayList<Integer> queue = new ArrayList<Integer>();
		Thread t1 = new Thread(new Producer(queue, size), "Producer");
		Thread t11 = new Thread(new Consumer(queue, size), "Consumer2");
		Thread t2 = new Thread(new Consumer(queue, size), "Consumer");
		Thread t21 = new Thread(new Producer(queue, size), "Producer2");
		
		t1.start();
		t11.start();
		t2.start();
		t21.start();
	}
	
}
