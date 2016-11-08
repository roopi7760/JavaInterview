package csJava;

import java.util.Scanner;

public class SumOfNumbers {
public static void main()
{
	int n;
	int sum=0;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Please enter the non zero integer");
	n = in.nextInt();
	
	if(n<=0)
	{
		System.out.println("Number entered is not valid" );
		
	}
	else
	{
		for(int i=1;i<=n;i++)
		{
			sum = sum+i; 
		}
		
		System.out.println("The sum of number 1 to " + n + " is " + sum);
	}
	
}
}
