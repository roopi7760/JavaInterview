package interview;

public class Immutable2DSum {
	public int [][] T;
	public Immutable2DSum(int[] [] input)
	{
		int row =0, col = 0;
		row = input.length;
		col = input[0].length;
		
		T = new int[row+1][col+1];
		
		for(int i=1; i< T.length ; i++)
			for(int j=1; j< T[0].length; j++)
				T[i][j] = T[i-1][j]+ T[i][j-1] + input[i-1][j-1] - T[i-1][j-1]; 
	}
	
	public int sumQuery(int row1, int col1, int row2, int col2)
	{
		row1++;
		col1++;
		row2++;
		col2++;
		
		int sum = T[row2][col2] - T[row2][col1-1] - T[row1-1][col2] + T[row1-1][col1-1];
		return sum;
	
	}
	
	public static void main(String [] args)
	{
		int [][] input = 	{{2,0,-3,4},
							{6,3,2,-1},
							{5,4,7,3},
							{2,-6,8,1}};
		Immutable2DSum abc = new Immutable2DSum(input);
		
		System.out.println(abc.sumQuery(1, 1, 3, 2));
		
		
	}

}
