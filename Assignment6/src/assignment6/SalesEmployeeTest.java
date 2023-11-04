package assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesEmployeeTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<SalesEmployee> salesEmployees = new ArrayList<SalesEmployee>();
		
		salesEmployees.add(new SalesPerson("Hal", "Finney", "A2165358"));
		
		salesEmployees.add(new SalesAgent("Adam", "Back", "C4456848"));
		
		salesEmployees.add(new SalesPerson("Satoshi", "Nakamoto", "C5646848"));
		
		
		for(SalesEmployee s : salesEmployees) {
			String typeOfEmployee = "";
			
			if(s instanceof SalesPerson) {
				typeOfEmployee = "Sales Person";
			} else {
				typeOfEmployee = "Sales Agent";
			}
												
			System.out.printf("Enter the Sales for %s %s %s: ", 
					typeOfEmployee, s.getFirstName(), s.getLastName());
			s.sales = input.nextDouble();
			s.calculateCommission();
		}
			
		
		System.out.println(" ");
		System.out.println("List of Sales Employees:");
		System.out.println("=======================");
				
		for(SalesEmployee s : salesEmployees) {
			System.out.println(s.toString());
		}
		
	}
}
