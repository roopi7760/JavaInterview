package interview;

public class UniqueString {

	public static void main(String [] args)
	{
		String sample = new String("mysorem");
		
		boolean[] char_set = new boolean[128];
		for(int i=0; i< sample.length(); i++)
		{
			int val = sample.charAt(i);
			if(char_set[val])
			{
				System.out.println("Not unique");
				break;
			}
			else
				char_set[val] = true;
		}
	}
	
}
