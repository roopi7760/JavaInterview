package interview;

public class StringPermPalind {
	
	public boolean checkmaxodd(int[] table)
	{
		boolean oddFlag = false;
		for(int count: table)
		{
			if(count % 2 == 1)
			{
				if(oddFlag){
					return false;
				}
				oddFlag = true;
			}
			
			//return true;
		}
		
		return true;
	}
	
	public int getCharNumb(char c)
	{
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		
		if(a <= val && z >= val)
		{
			return val-a;
		}
		return -1;
	}
	
	public int[] buildFreqTable(String phrase)
	{
		int [] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a')+1];
		for(char c : phrase.toCharArray())
		{
			int x = getCharNumb(c);
			
			if(x != -1)
			{
				table[x]++;
			}
		}
		return table;
	}
	
	public boolean ispermpalind(String phrase)
	{
		int [] table = buildFreqTable(phrase);
		
		return checkmaxodd(table);
	}
	
	
	public static void main(String [] args)
	{
		StringPermPalind a= new StringPermPalind();
		
		System.out.println(a.ispermpalind("tactcoapapa"));
	}
	
}
