/*
 * Group 3
 * Roopesh Kumar Krishna kumar
 * Chirag Hemmanahalli Girish
 * Saurabh Srinivas Prasanna
 * 
 */

package csJava;

import java.util.Scanner;

public class RainfallDemo {
public static void main(String [] args)
{
	Scanner in = new Scanner(System.in);
	Rainfall rv = new Rainfall();
	String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	double [] array = new double[12];
	
	for(int i=0; i<12; i++){
	System.out.println("Enter the rainfall for " + month[i]);
	double temp = in.nextDouble();
	if(temp>0)
		array[i] = temp;
	else
	{
		System.out.println("Please enter positive value....");
		i--;
	}
 }
	rv.setRainfall(array);
	
	System.out.println("Total rain fall for the year is " + rv.getTotalRainfall());
	System.out.printf("Average monthly rain fall for the year is %5.2f\n",rv.getMonthlyAverage());
	System.out.println("Month with most rain is  " + month[rv.getMostRainfallMonth()]);
	System.out.println("Month with least rain is  " + month[rv.getLeastRainfallMonth()]);
	
}
}
