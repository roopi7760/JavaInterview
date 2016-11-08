package csJava;

import java.util.Arrays;

//Main Rainfall class
public class Rainfall {
	//Declare array to hold the rainfall readings of the year
	private double[] rainfall = new double[12];
	
	//Constructor to initialize the array to zero
	public Rainfall()
	{
		for(int i=0; i<12;i++)
			rainfall[i]=0;
	}
	//Set function to set the array to the user entered values. Already checked for the negativity
	public void setRainfall(double [] rainfall)
	{
		for(int i=0; i<12;i++)
		{
			this.rainfall[i] = rainfall[i];
		}
	}
	
	//Getter method to fetch the rainfall readings
	public double[] getRainfall()
	{
		return this.rainfall;
	}
	
	//Function to calculate the total rainfall of the year
	public double getTotalRainfall()
	{
		double sum=0;
		for(int i=0; i<12; i++)
		{
			sum+= this.rainfall[i];
		}
		return sum;
	}
	
	//Function to calculate the monthly average 
	public double getMonthlyAverage()
	{
		double average=0;
		average = this.getTotalRainfall()/12;
		return average;
	}
	
	//Function to return the most rainfall month
	public int getMostRainfallMonth()
	{
		int max = 0;
		for(int i=1; i<12; i++)
		{
			
			if(this.rainfall[i] > this.rainfall[max])
			{
				max = i;
			}
		}
		return max;
	}
	
	//Function to return the least rainfall month
	public int getLeastRainfallMonth()
	{
		int min = 0;
		for(int i=1; i<12; i++)
		{
			if(this.rainfall[i] < this.rainfall[min])
			{
				min = i;
			}
		}
		return min;
	}
}

//End of the class