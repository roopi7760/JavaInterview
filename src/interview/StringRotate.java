package interview;

public class StringRotate {
public boolean isRotatedString(String input, String pattern){
		
		if(input.length() != pattern.length()){
			return false;
		}
		boolean matchFound = false;
		char array_input[] = input.toLowerCase().toCharArray();
		char array_pattern[] = pattern.toLowerCase().toCharArray();
		int i = 0, j =  0;
		for(; i < array_input.length ; ){
			if(array_input[i] == array_pattern[j]){
				i++;
				j++;
				matchFound = true;
			}else{
				i++;
			}
		}
		if(matchFound){
			System.out.println("MatchFOund");
			StringBuffer buffer = new StringBuffer();
			for(; j< array_pattern.length; j++){
				buffer.append(array_pattern[j]);
			}
			String buff = buffer.toString();
			System.out.println(buff);
			// contains method works as IsSubString(String a, String b );
			return(input.contains(buff));
		}
		return false;
	}

public static void main(String [] args)
{
	StringRotate a = new StringRotate();
	System.out.println(a.isRotatedString("water","rwate"));
}
}
