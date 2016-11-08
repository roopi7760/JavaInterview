package csJava;

import java.util.*;

public class DisplayDepartment {

	public static void main(String [] args)
	{
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int floor;
		String department;
		
		//Get floor number from the user
		System.out.println("Enter floor number: ");
		floor = input.nextInt();
		
		//Display department name based on the floor number
		
		switch(floor)
		{
		case 1:
			System.out.println("Engineering");
			break;
		case 2:
			System.out.println("Management");
			break;
		case 3:
			System.out.println("Dean's Office");
			break;
		case 4: 
			System.out.println("Accounting");
			break;
		case 5: 
			System.out.println("Informations Systems");
			break;
			default:
				System.out.println("Floor does not exist");
				
		}
	}
}
