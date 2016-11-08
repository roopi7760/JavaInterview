package interview;

public class OneEditString {

	public boolean checkReplace(String str1, String str2)
	{
		boolean found = false;
		for(int i=0; i< str1.length() ; i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				if(found)
					return false;
				found = true;
			}
		}
		
		return true;
	}
	
	public boolean checkInsert(String str1, String str2)
	{
		int index1 = 0; int index2 = 0;
		while(index1 < str1.length() && index2 < str2.length())
		{
			if(str1.charAt(index1) != str2.charAt(index2))
			{
				if(index1 != index2)
					return false;
				
				index2++;
			}
			else
			{
				index1++;
				index2++;
			}
		}
		return true;
		
	}
	
	public boolean checkOneEdit(String str1, String str2)
	{
		if(str1.length() == str2.length())
		{
			return checkReplace(str1,str2);
		}
		else if(str1.length() < str2.length())
		{
			return checkInsert(str1, str2);
		}
		else
		{
			return checkInsert(str2, str1);	
		}
		
		
	}
	
	public static void main(String [] args)
	{
		
		OneEditString a = new OneEditString();
		System.out.println(a.checkOneEdit("bple", "apple"));
		
	}
}
