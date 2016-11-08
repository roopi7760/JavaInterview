import java.util.*;

class Q
{
	int n;
	boolean valueSet = false;
	
	synchronized int get()
	{
		while(!valueSet)
		{
			try{
				wait();
				
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("GOT : " + n);
		valueSet = false;
		notify();
		return n;
	}
	
	synchronized void put(int n)
	{
		while(valueSet)
		{
			try
			{
				wait();
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
		this.n = n;
		valueSet = true;
		System.out.println("PUT : " + n);
		notify();
	}
}

class producer implements Runnable
{
	Q q;
	
	producer(Q q)
	{
		this.q = q;
		new Thread(this, "Producer").start();
	}
	public void run()
	{
		int i=0;
		
		while(i<5)
		{
			q.put(i++);
		}
	}
}

class consumer implements Runnable
{
	Q q;
	consumer(Q q)
	{
		this.q=q;
		new Thread(this, "consumer").start();
	}
	public void run()
	{
		int i =0 ;
		while(i <5)
		{
			q.get();
			i++;
		}
	}
}
public class ConsumerProducer {
	public  void main1()
	{
		Q q =  new Q();
		new producer(q);
		new consumer(q);
		
	}

}
