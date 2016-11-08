package csJava;

import java.util.Random;

public class FillArrays {

	public void generateRandom(int[] random)
	{
		Random rand= new Random();
		for(int i=0; i< 20 ; i++)
		{
			random[i] = rand.nextInt(100);
		}
	}
	
	public void uniGenerateRandom(int[] uniRandom)
	{
		int j=0;
		Random rand= new Random();
		for(int i=0; i< 20 ; i++)
		{
			int temp = rand.nextInt(100);
			while(j<i)
			{
				if(temp == uniRandom[j])
				{
					temp = rand.nextInt(100);
					j=0;
				}
				else
					j++;
			}
			uniRandom[i] = temp;
			j=0;
		}
	}
	
	public void display(int[] array)
	{
		
		for(int i: array)
		{
			System.out.print(i + ", ");
		}
		System.out.println("");
	}
	
	public static void main(String [] args)
	{
		FillArrays fa = new FillArrays();
		int[] randomNumbers = new int[20];
		int[] uniRandomNumbers = new int[20];
		fa.generateRandom(randomNumbers);
		fa.uniGenerateRandom(uniRandomNumbers);
		
		System.out.println("Content of the Random Array of size " +  randomNumbers.length);
		fa.display(randomNumbers);
		
		System.out.println("Content of the Unique Random Array of size " + uniRandomNumbers.length);
		fa.display(uniRandomNumbers);
	}
}
