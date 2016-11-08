package csJava;

import java.util.Scanner;

public class DaysOfMonth {

	
	public static void main(String [] args)
	{
		int month, year, numberOfDays=0;
		String englishMonth = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a month (1:Jan, 2:Feb, etc) : ");
		month = input.nextInt();
		System.out.println("Enter a Year : ");
		year = input.nextInt();
		switch(month)
		{
		case 1:
			englishMonth = "January";
			numberOfDays = 31;
			break;
		case 2:
			englishMonth="Febraury";
			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
			if(isLeapYear)
				numberOfDays = 29;
			else
				numberOfDays = 28;
			break;
		case 3:
			englishMonth = "March";
			numberOfDays = 31;
			break;
		case 4:
			englishMonth = "April";
			numberOfDays = 30;
			break;
		case 5:
			englishMonth = "May";
			numberOfDays = 31;
			break;
		case 6:
			englishMonth = "June";
			numberOfDays = 30;
			break;
		case 7:
			englishMonth = "July";
			numberOfDays = 31;
			break;
		case 8:
			englishMonth = "August";
			numberOfDays = 31;
			break;
		case 9:
			englishMonth = "September";
			numberOfDays = 30;
			break;
		case 10:
			englishMonth = "October";
			numberOfDays = 31;
			break;
		case 11:
			englishMonth = "November";
			numberOfDays = 30;
			break;
		case 12:
			englishMonth = "December";
			numberOfDays = 31;
			break;
		default:
			System.out.println("Sorry, You entered an invalid month...");
			break;
		
		}
		
		if(numberOfDays > 1)
		{
			System.out.println("Number of Days in " + englishMonth + ", " + year + " is " + numberOfDays);
		}
		
		
	}
}
