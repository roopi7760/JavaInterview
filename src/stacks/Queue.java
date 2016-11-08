package stacks;

public class Queue {

	int tail, head;
	int queue[] = new int[10];
	
	public Queue()
	{
		this.tail = 0;
		this.head = 0;
	}
	
	public void enqueue(int item)
	{
		
		if(tail == queue.length)
		{
			System.out.println("Queue is full");
		}
		else
		{
			tail+=1;
			queue[tail] = item;
		}
			
	}
	
	public int dequeue()
	{
		int item = queue[head];
		if(head == queue.length)
			head = 1;
		else
			head+=1;
		
		return item;
	}
	
	public static void main(String args[])
	{
		Queue Q = new Queue();
		Q.enqueue(5);
		Q.enqueue(6);
		int x = Q.dequeue();
		
		System.out.println(x);
	}
}
