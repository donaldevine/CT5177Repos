package assignment3;

import java.util.Scanner;

/**
 * Question 1: Program to display number of digits entered by user
 */
public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // get user input from console.
		
		int num = 0;
		
		System.out.println("This program counts the number of digits ");
		System.out.println("in an integer entered by the user. ");
		System.out.println("Enter -1 to exit. ");
		System.out.println(" ");
		
		// Loop 
		while (true) {
			System.out.print("Enter number: ");
			num = input.nextInt(); //store number in num
			
			//get number of digits
			int numOfDigits = String.valueOf(num).length();
			
			// exit loop if number entered is -1.
			if(num == -1) break; 
			
			// Output number and number of digits to console
			System.out.printf("Number of digits in %d is %d %n%n", 
					num, numOfDigits);
		}		
		
		System.out.println("Program Terminated ... ");
		
	} // end of main method
	
} // end of NumberOfDigits class

