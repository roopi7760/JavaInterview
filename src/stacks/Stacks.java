package stacks;

public class Stacks {

	int stack[] = new int[10];
	int top;
	
	public void Stacks(int item)
	{
		top = 0;
	}
	
	public boolean stack_empty()
	{
		if(top == 0)
		{
			return true;
		}
		
		return false;
	}
	
	public void push(int item)
	{
		top = top+1;
		stack[top] = item; 
	}
	
	public int pop()
	{
		int poppedItem = stack[top--];
		
		return poppedItem;
	}
	
	public void display()
	{
		System.out.println("Printing the elements in the stack");
		
		if(top==0)
			System.out.println("Stack is empty to display");
		else
		{
		
		for(int i=1 ; i<= top ; i++)
		{
			System.out.println(stack[i]);
		}
		}
	}
	
	public static void main(String args[])
	{
		Stacks S = new Stacks();
		
		S.display();
		
		S.push(5);
		
		S.push(3);
		
		S.display();
		
		S.pop();
		S.push(8);
		S.display();
	}
}
