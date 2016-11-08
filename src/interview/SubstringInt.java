package interview;

public class SubstringInt {

	public int[] convertToArray(long numb)
	{
		int size = (int)Math.log10(numb)+1;
		int [] array = new int[size];
		while(numb>0 && size >=0)
		{
			array[size-1] = (int) (numb%10);
			  numb=numb/10;
			  size--;
		}
		return array;
	}
	
	public boolean isSubInt(int [] array, int[] pat)
	{
		int i=0,j=0;
		
		while(i<array.length && j<pat.length)
		{
			if(array[i] == pat[j])
			{
				i++;
				j++;
				System.out.println(i + " " + j);
			}
			else{
				j=0;
				i++;
				}
		}		
		return (j>=pat.length)?true:false;
		
	}
	
	public static void main(String[] str)
	{
		int [] m, n;
		long aa = 25478963;
		long bb = 4789;
		SubstringInt a = new SubstringInt();
		m = a.convertToArray(aa);
		n = a.convertToArray(bb);
		System.out.println(a.isSubInt(m, n));
		
	}
}
