package interview;

import java.util.Scanner;

public class TwoSum {
public static void main(String [] args)
{
	int target;
	int sum[] = new int[] {0,1,5,7,8,9,4,3};
	System.out.println("Enter the target");
	Scanner in = new Scanner(System.in);
	target = in.nextInt();
	
	for(int i=0; i< sum.length ; i++)
	{
		for (int j = i+1; j< sum.length ; j++)
		{
			if(sum[j] == target-sum[i])
			{
				System.out.println("i = " + i + " j = " + j);
			}
		}
	}
}
}
