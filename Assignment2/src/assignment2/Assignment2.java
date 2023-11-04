package assignment2;

import java.util.Scanner;

public class Assignment2 {
	
	/**
	 * main entry point
	 * @param args array of command line parameters
	 */
	public static void main(String[] args)  
	{
		question1();	
		question2();
	}
		
	/**
	 * Asks the user for the length of the array and then prompts the user for each double value in the array
	 */
	private static void question1() 
	{
		Scanner input = new Scanner(System.in); // To get user input
		
		System.out.print("What is the array size?");
		int n = input.nextInt(); // n stores the size of the array
		
		// initialize the array based on the user input 
		double[] arrDouble = new double[n];		
		double sumOfValues = 0;
		
		// loop to get array values
		for(int i = 0; i < n; i++) {
			System.out.printf("What is %s value you wish to store? ", getOrdinal(i + 1));
			arrDouble[i] = input.nextDouble(); //store the user input in the array			 
			sumOfValues += arrDouble[i]; //running total
		}
		
		// print out the sum formatted to 2 decimal places:
		System.out.printf("%nSum of value (rounded to 2 decimal places): %.2f %n %n", sumOfValues);
		
		// loop to get print array values, formatted to 2 decimal places
		for(int i = 0; i < n; i++) {
			System.out.printf("%s value (rounded to 2 decimal places): %8.2f %n", getOrdinal(i + 1), arrDouble[i]);			
		}		
	}
	
	/**
	 * Asks the user to input a year and outputs if the year is a leap year
	 */
	private static void question2() 
	{
		Scanner input = new Scanner(System.in); // Scanner gets user input
		
		System.out.print("\nPlease enter year: ");
		
		int year = input.nextInt();
		
		assert year >= 1583; // leap year not valid before 1583
		
		//If the year is divisible by 4 but not by 100 (but is by  400) then it is a leap year
		if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		}else {
			System.out.println(year + " is not a leap year.");
		}		
	}
	
	
	/**
	 * Converts an integer to an ordinal string representation
	 * @param i integer value
	 * @return ordinal string representation of integer 
	 */
	private static String getOrdinal(int i) 
	{
	    String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
	    switch (i % 100) {
	    case 11:
	    case 12:
	    case 13:
	        return i + "th";
	    default:
	        return i + suffixes[i % 10];

	    }
	}
}
