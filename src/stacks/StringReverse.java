package stacks;

public class StringReverse {
	public char str[];
	int top;
	public StringReverse()
	{
		str = new char[20];
		
	
		top= -1;
	}
	
	public void push(char item)
	{
		try{
			
		str[++top] = item;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public char pop ()
	{
		char item = str[top--];
		return item;
	}
	
	
	public static void main(String args[])
	{
		StringReverse s1 = new StringReverse();
		int count=0;
		String sample = "Hello World!";
		System.out.println("Original String:   " + sample);
		for(int i=0;i< sample.length();i++)
		{
			s1.push((char)sample.charAt(i));
			count++;
		}
		
		System.out.print("Altered String:    ");
		for(int i=0;i<count;i++)
		{
			System.out.print(s1.pop());
		}
	}
}
