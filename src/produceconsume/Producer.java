package produceconsume;

import java.util.ArrayList;

public class Producer implements Runnable{
	private final ArrayList<Integer> queue;
	private final int size;
	public Producer(ArrayList<Integer> queue, int size)
	{
		this.queue = queue;
		this.size = size;
	}
	public void run()
	{
		for(int i=0; i<7; i++)
		{
			System.out.println("Produced " + i + " By " + Thread.currentThread().getName());
			try{
			produce(i);
			//Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void produce(int i) throws InterruptedException
	{
		while(this.queue.size() == size)
		{
			synchronized(this.queue){
			System.out.println("Queue is full with size " + this.queue.size() + " waiting thread is " + Thread.currentThread().getName());
			}
		}
		
		synchronized(this.queue)
		{
			queue.add(i);
			queue.notifyAll();
		}
	}

}
