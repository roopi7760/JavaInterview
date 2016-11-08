package stacks;

public class BalanceParan {
	char stack[];
	int top;
public BalanceParan()
{
	stack = new char[10];
	top = -1;
}

public void push(char item)
{
	stack[++top] = item;
}

public char pop()
{
	char item;
	item = stack[top--];
	return item;
}

public static void main(String args[])
{
	BalanceParan S = new BalanceParan();
	
	String str = "([{()";
	
	for(int i=0; i< str.length();i++)
	{
		if(str.charAt(i) == '['|| str.charAt(i) == '{' || str.charAt(i) == '(')
		{
			S.push(str.charAt(i));
		}
		else
		{
			char ten = S.pop();
			//System.out.println(str.charAt(i) + "  " + ten);
			if((str.charAt(i)=='}' && ten=='{') || (str.charAt(i)==')' && ten=='(') || (str.charAt(i)==']' && ten=='[') )
				continue;
			else
				System.out.println("Paranthesis are not balanced.");
			return;
		}
	}
	if(S.top != -1)
		System.out.println("Paranthesis left in the stack");
	else
		System.out.println("Paranthesis are balanaced.. Yahoo!");
}
}
