package stacks;

import java.util.Stack;

public class StackRecursion {
Stack <Integer> stk;

public StackRecursion()
{
	stk = new Stack<Integer>();
}

public static void InsertAtBottom(StackRecursion S,int item)
{
	if(S.stk.isEmpty())
	{
		//System.out.println(item);
		S.stk.push(item);
	}
	else
	{
		int temp = S.stk.pop();
		InsertAtBottom(S, item);
		S.stk.push(temp);
	}
}

public static void reverse(StackRecursion S)
{
	if(! S.stk.empty())
	{
		int temp = S.stk.pop();
		//System.out.println(temp);
		reverse(S);
		
		InsertAtBottom(S,temp);
	}
	
}

public static void main(String args[])
{
	StackRecursion S = new StackRecursion();
	
	for(int i=0; i< 5;i++)
	{
		S.stk.push(i);
		//System.out.println(S.stk.peek());
	}
	reverse(S);

	for(int i = 0;i<5;i++)
	{
		System.out.println(S.stk.pop());
	}
}


}
