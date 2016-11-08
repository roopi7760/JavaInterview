package stacks;

public class QueuesUsingStacks {
	int [] s = new int[10];
	int [] s2 = new int[10];
	int top;
	public void QueuesUsingStacks()
	{
		top=-1;
	}
	
	public void enque(int item)
	{
		if(top==-1)
		{
			s[top++] = item;
		}
		else
		{
			for(int i=0;i< top; i++)
			{
				s2[i]=s[i];
			}
			s[0] = item;
			top=top+1;
			for(int i=1;i<top;i++)
			{
				s[i] = s2[i-1];
			}
		}
			
	}
	
	public int deque()
	{
		if(top ==-1)
		{
			System.out.println("There are no item to deque");
		}
		else
		{
			return s[--top];
		}
		return 0;
	}
	
	public static void main(String args[])
	{
		QueuesUsingStacks samp = new QueuesUsingStacks();
		
		samp.enque(5);
		samp.enque(6);
		//System.out.println(samp.top);
		for(int i=0;i<samp.top;i++)
			System.out.println(samp.s[i]);
		System.out.println(samp.deque());
	}

}
