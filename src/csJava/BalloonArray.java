package csJava;

import java.util.Scanner;

public class BalloonArray {

	public Balloon createBalloon(double radius)
	{
		Balloon a= new Balloon();
		a.inflate(radius);
		return a;
	}
	public void displayBallons(Balloon[] balloons, int limit)
	{
		System.out.print("Balloon   Radius   Volume\t\n");
		System.out.print("-------   ------   ------\t\n");
		for(int i=0; i< limit;i++)
		{
			System.out.printf("%2d  %11.2f  %9.2f",i+1,balloons[i].getRadius(), balloons[i].getVolume());
			System.out.println("");
		}
	}
	public static void main(String[] args)
	{
		BalloonArray ba= new BalloonArray();
		Scanner in = new Scanner(System.in);
		int answer = 1;
		double radius;
		Balloon[] balloons = new Balloon[20];
		int count=0;
		while(answer == 1)
		{
			if(count >20)
			{
				System.out.println("Array size exceeded");
				break;
			}
			System.out.println("Enter the size of the balloon");
			radius = in.nextDouble();
			balloons[count++] = ba.createBalloon(radius);
			System.out.println("Do you want to continue (Yes:1, No:0)");
			answer = in.nextInt();
		}
		
		ba.displayBallons(balloons,count);
		
		
		
	}
}
