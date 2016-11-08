package interview;

public class ZeroMatrix {

	
	public int[][] nullifyRow(int [][] matrix, int row)
	{
		for(int j =0; j< matrix[0].length; j++)
		{
			matrix[row][j] = 0;
		}
		
		return matrix;
	}
	
	public int[][] nullifyCol(int [][] matrix, int col)
	{
		for(int j =0; j< matrix.length; j++)
		{
			matrix[j][col] = 0;
		}
		
		return matrix;
	}
	public int[][] nullifyMatrix(int [][] matrix)
	{
	   boolean rowHasZero=false;
	   boolean colHasZero = false;
	   
	   for(int i=0; i< matrix[0].length; i++)
	   {
		   if(matrix[0][i] == 0)
		   {
			   rowHasZero = true;
			   break;
		   }
	   }
	   
	   for(int j=0; j< matrix.length; j++)
	   {
		   if(matrix[j][0] == 0)
		   {
			   colHasZero = true;
			   break;
		   }
	   }
	   
	   for(int i=0; i< matrix.length; i++)
	   {
		   for(int j=0; j< matrix[0].length; j++)
		   {
			   if(matrix[i][j] == 0)
			   {
				   matrix[i][0] = 0;
				   matrix[0][j]=0;
			   }
		   }
	   }
	   
	   for(int i=1; i<matrix.length;i++)
	   {
		   if(matrix[i][0] == 0)
		   {
			   matrix = nullifyRow(matrix, i);
		   }
	   }
	   
	   for(int j=1; j< matrix[0].length; j++)
	   {
		   if(matrix[0][j] == 0)
		   {
			   matrix = nullifyCol(matrix, j);
		   }
	   }
	   
	   if(rowHasZero)
	   {
		   matrix = nullifyRow(matrix, 0);
	   }
	   if(colHasZero)
	   {
		   matrix = nullifyCol(matrix, 0);
	   }
		   
		
		return matrix;
	}
	
	public static void main(String [] args)
	{
		ZeroMatrix a = new ZeroMatrix();
		int[][] matrix = {{7,5,0,7},
						  {3,0,6,3},
						  {0,5,3,4},
						  {4,6,3,2}};
		matrix = a.nullifyMatrix(matrix);
		
		for(int i=0; i< matrix.length; i++)
		{
			for(int j=0; j< matrix[0].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	
}
