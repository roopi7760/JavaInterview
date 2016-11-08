class A{
	synchronized void foo(B b)
	{
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " entered foo");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(" A interrupted");
		}
		System.out.println(name + " trying to call B");
		b.last();
	}
	
	synchronized void last()
	{
		System.out.println("Inside A last()");
	}
}

class B
{
	synchronized void bar(A a)
	{
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered bar");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println("B interruped");
		}
		
		System.out.println("Trying to call A last");
		a.last();
	}
	
	synchronized void last()
	{
		System.out.println("Inside B last");
	}
}

public class deadLock implements Runnable {
	A a = new A();
	B b = new B();
	deadLock()
	{
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this, "raceing Thread");
		t.start();
		a.foo(b);
		System.out.println("Back in main thread");
	}
	
	public void run()
	
	{
		b.bar(a);
		System.out.println("Back in other thread");
	}
	public void main_program()
	{
		new deadLock();
	}
}
