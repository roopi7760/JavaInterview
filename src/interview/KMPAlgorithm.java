package interview;

public class KMPAlgorithm {

	public int[] F;
	
	public void prefixTable(String P, int m)
	{
		
		F = new int[m+1];
		int i=1, j=0;
		F[0]=0;
		
		while(i<m)
		{
			if(P.charAt(i) == P.charAt(j))
			{
				F[i] = j+1;
				i++;
				j++;
			}
			else if(j>0)
				j = F[j-1];
			else{
				F[i]=0;
				i++;
			}
		}
		
	}
	
	public int KMPMatching(String T, int n, String P, int m)
	{
		int i=0, j=0;
		while(i<n)
		{
			if(T.charAt(i) == P.charAt(j))
			{
				if(j==m-1)
				{
					return i-j;
				}
				i++;
				j++;
			}
			else if(j>0)
				j = F[j-1];
			else
				i++;
		}
		
		
		return -1;
	}
	
	public static void main(String [] args)
	{
		KMPAlgorithm a = new KMPAlgorithm();
		String T = "bacbabababacaca";
		String P = "ababaca";
		
		a.prefixTable(P, P.length());
		System.out.println("String "+ P + "  found at position " + a.KMPMatching(T, T.length(),P, P.length()));
	}
	
}
