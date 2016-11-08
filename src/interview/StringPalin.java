package interview;

public class StringPalin {

	public boolean isPalin(String str)
	{
		int index = str.length()/2; 
		int i=index-1; 
		int j = (str.length()%2==0) ? index:index+1 ;
		while(i>=0 && j<str.length())
		{
			if(str.charAt(i) == str.charAt(j))
			{
				i--;
				j++;
			}
			else
				return false;
		}
		return true;
	}
	
	public static void main(String [] args)
	{
		StringPalin str = new StringPalin();
		
		System.out.println(str.isPalin("aaaaccbccaa"));
	}
}
