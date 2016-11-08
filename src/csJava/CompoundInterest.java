package csJava;

public class CompoundInterest {

	
	public static void main(String [] args)
	{
		double amount  = 1000.00;
		int n = 10;
		
		System.out.println("Year\tAmount(5%)\tAmount(6%)\tAmount(7%)\tAmount(8%)\tAmount(9%)\tAmount(10%)");
		for(int i=1;i<=n;i++)
		{
			System.out.printf("%d\t", i);
			for(float r=5;r<=10;r++)
			{
				double result = amount*  Math.pow ((1.0 + r/100), i);
				System.out.printf("%8.2f\t", result);
			}
			System.out.println("");
		}
	}
}
