package csJava;


import java.util.Scanner;
public class Triangle {

	
	public static void main(String [] args)
	{
		double s1, s2, s3;
		
		System.out.println("Enter the sides of the triangle: ");
		
		Scanner input = new Scanner(System.in);
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
		if((s1+s2) > s3 && (s1+s3) > s2 && (s2+s3) > s1)
		{
			System.out.println("It is a triangle");
			
		}
		else
		{
			System.out.println("It is not a triangle");
		}
	}
}
