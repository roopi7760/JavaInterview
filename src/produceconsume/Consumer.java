package produceconsume;

import java.util.ArrayList;

public class Consumer implements Runnable {
	private final ArrayList<Integer> queue;
	private final int size;
	
	public Consumer(ArrayList<Integer> queue, int size)
	{
		this.queue = queue;
		this.size = size;
	}
	
	public void run()
	{
		for(int i=0; i<7; i++)
		{
			
			try
			{
				System.out.println("Consumed " + consume() + " By " + Thread.currentThread().getName());
				//Thread.sleep();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public Integer consume() throws InterruptedException
	{
		while(this.queue.isEmpty())
		{
			synchronized(this.queue){
			System.out.println("Queue is empty and the thread " + Thread.currentThread().getName() + " is waiting to consume" );
			this.queue.wait();
			}
		}
		
		synchronized(this.queue)
		{
			return (Integer) this.queue.remove(0);
		}
	}
	
	
}
