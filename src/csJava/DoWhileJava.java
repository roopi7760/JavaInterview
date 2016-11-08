package csJava;

import java.util.Scanner;

public class DoWhileJava {

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		double x=0;
		double s;
		
		s= 1.0/ (1+n*n);
		while(s>=0.01)
			{
			n++;
			x=x+s;
			s = 1.0/(1+n*n);
			
			}
	}
}
