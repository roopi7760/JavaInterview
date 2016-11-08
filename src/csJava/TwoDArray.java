package csJava;

public class TwoDArray {

	public static void main(String [] args)
	{
		int[][] numberArray = new int[9][11];
		
		for(int i=0; i<numberArray.length; i++)
		{
			numberArray[i][1] = 145;
		}
		
		numberArray[8][3] = 18;
		for(int i=0; i<numberArray[0].length; i++)
		{
			numberArray[5][i] = 22;
		}
		
		numberArray[6][8] = 83;
		for(int i=0; i<numberArray.length; i++)
		{
			for(int j=0; j< numberArray[0].length;j++)
			{
				System.out.printf("%4d",numberArray[i][j]);
			}
			System.out.println("");
		}
	}
	
}
