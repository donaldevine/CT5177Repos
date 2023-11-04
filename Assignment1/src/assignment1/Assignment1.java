package assignment1;
import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) 
	{		
		// Get input from user
		Scanner input = new Scanner(System.in);
				
		// Here I used an array to store the seat types to keep it DRY			
		String[] seatTypes = {"A", "B", "C"};
		
		int n = seatTypes.length;
		
		// Use arrays to store the seats sold and seat prices
		int[] seatsSold = new int[n];				
		double[] seatPrices = new double[n];				
		double totalSales = 0;
						
		// Get the user input
		for(int i = 0; i < n; i++) 
		{
			System.out.printf("Enter number of %s seats sold: ", seatTypes[i]);			
			seatsSold[i] = input.nextInt();
			
			System.out.printf("Enter price of %s tickets: ", seatTypes[i]);						
			seatPrices[i] = input.nextDouble();
															
			// calculate running total
			totalSales = totalSales + (seatPrices[i] * seatsSold[i]);			
		}
		
		input.close(); //close the Scanner to avoid memory leak warning 
		
		// Output the results to the console		
		System.out.println("\n\t\tTickets Sold\tPrice per ticket");
		System.out.println("\t\t------------\t----------------");
		
		//Here I used printf instead of DecimalFormat to get the alignment correct. 
		for(int i = 0; i < n; i++) 
		{						
			System.out.printf("%s Tickets:\t %6d \t %8.2f \n", 
					seatTypes[i], seatsSold[i], seatPrices[i]);			
		}
				
		System.out.printf("\n \t\t Total Sales € %.2f", totalSales);		
	}
	
}
