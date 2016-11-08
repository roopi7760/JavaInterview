package interview;

public class StringPerm {
public static void main(String [] str)
{
	String str1 = "dog";
	String str2 = "mod";
	boolean [] char_set = new boolean[128]; 
	if(str1.length() == str2.length())
	{
		for(int i=0; i<str1.length(); i++)
		{
			char_set[str1.charAt(i)] = true;
		}
		
		for(int j=0; j< str2.length(); j++)
		{
			if(char_set[str2.charAt(j)])
				continue;
			else 
				{
				System.out.println("not Permutation");
				break;
				}
		}
	}
}
}
