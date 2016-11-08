//Program to compute area of a circle

package csJava;

import java.util.Scanner;
import java.lang.Math;

public class Circle {
	
	public static void main(String [] args)
	{
		//Declare and create a scanner object
		Scanner input = new Scanner(System.in);
		//Declare variables
		int radius;
		double area, circumference;
		
		//Read radius from the user
		System.out.println("Enter the radius: ");
		input.nextInt();
		
		//Assign value to radius
		radius = 5;
		
		//Compute area of circle (PI * r * r)
		
		area = Math.PI * Math.pow(radius, 2);
		
		//Display output
		System.out.println("Area of the circle is " + area);
		
		System.out.printf("\nArea of the circle is %1.2f \b = %.2f", area, radius);
	}

}
