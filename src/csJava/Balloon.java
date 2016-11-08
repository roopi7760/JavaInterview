package csJava;

import java.util.Scanner;
import java.lang.Math;

public class Balloon{

  //Declare variables
	private double radius;
  //No Argument Constructor
	public Balloon()
	{
		//radius = 0.0;
		setRadius(0.0);
	}
	
	


//Accessor and Mutator methods
//Get and Set methods

public void setRadius(double r)
{
  radius = r;
}

public double getRadius()
{
  return radius;
}

public double getVolume()
{
  double volume = (4.0 * Math.PI* Math.pow(getRadius(),3)/3.0);
  return volume;
}

public void inflate(double amount){
  radius += amount;
}
}
