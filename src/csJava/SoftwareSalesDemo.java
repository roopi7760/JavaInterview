package csJava;

import java.util.Scanner;

public class SoftwareSalesDemo {
	
	public static void main(String [] args)
	{
		SoftwareProduct Student = new SoftwareProduct(1,0);
		SoftwareProduct Academic = new SoftwareProduct(2,0);
		SoftwareProduct Commercial = new SoftwareProduct(3,0);
		
		System.out.println("Welcome to Software Sales!");
		int answer=1;
		int purchaseType;
		int quantity;
		double totalCost=0.0;
		double studentTotal, academicTotal, commercialTotal;
		Scanner in = new Scanner(System.in);
		while(true)
		{
		System.out.print("Do you want to purchase? (0:No 1:Yes) :");
		answer = in.nextInt();
		if(answer == 1)
			{
			System.out.print(" 1) Student \n 2) Academic (Faculty) \n 3) Commercial \nEnter the type of Purchase: \n");
			purchaseType = in.nextInt();
			System.out.print("Enter the quantity: \n");
			quantity = in.nextInt();
			if(quantity <= 2){
			switch(purchaseType)
			{
			case 1:
				
				if(Student.getQuantity() + quantity <= 2 )
					Student.setQuantity(quantity);
			
				else
					System.out.println("Quantity for this purchase type is already " + Student.getQuantity() + ". You can't order more than 2 in each purchase type");
				break;
			case 2:
				
				if(Academic.getQuantity() + quantity <= 2)
					Academic.setQuantity(quantity);
				
				else
					System.out.println("Quantity for this purchase type is already " + Academic.getQuantity() + ". You can't order more than 2 in each purchase type");
				break;
			case 3:
				if(Commercial.getQuantity() + quantity <= 2)
					Commercial.setQuantity(quantity);
				else
					System.out.println("Quantity for this purchase type is already " + Commercial.getQuantity() + ". You can't order more than 2 in each purchase type");
				break;
			default:
				System.out.println("Invalid purchase type entered! Try with different number...");
					break;
			}
				
			}
			else
				System.out.println("Quantity can not be more than 2. Try again!");
			}
		else
			break;
		}
		
		studentTotal = Student.calculateTotalCost();
		academicTotal = Academic.calculateTotalCost();
		commercialTotal = Commercial.calculateTotalCost();
		totalCost = studentTotal + academicTotal + commercialTotal ;
		if(studentTotal != 0 )
			System.out.printf("\n\nCost of Software Product Student: $%.2f \n", studentTotal);
		if(academicTotal != 0 )
			System.out.printf("Cost of Software Product Academic: $%.2f \n", academicTotal);
		if(commercialTotal != 0)
			System.out.printf("Cost of Software Product Commercial: $%.2f \n", commercialTotal);
		
		System.out.printf("Total Cost of the Purchase: $%.2f\n", totalCost);
		System.out.println("Thank you for purchasing...");
		
		
	}
}
