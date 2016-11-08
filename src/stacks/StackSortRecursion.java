package stacks;

import java.util.Stack;

public class StackSortRecursion {
Stack <Integer> stk;

public StackSortRecursion()
{
	stk = new Stack<Integer>();
}

public static void InsertAtBottom(StackSortRecursion S,int item)
{
	if(S.stk.isEmpty() || S.stk.peek() < item)
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

public static void reverse(StackSortRecursion S)
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
	StackSortRecursion S = new StackSortRecursion();
	
	S.stk.push(3);
	S.stk.push(4);
	S.stk.push(2);
	S.stk.push(1);
	reverse(S);
	System.out.println(S.stk.pop());
	for(int i = 0;i<4;i++)
	{
		
	}
}


}
