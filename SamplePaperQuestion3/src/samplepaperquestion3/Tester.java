package samplepaperquestion3;

import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Comparator;

public class Tester {
	public static void main(String[] args) {
		
		Company c = new Company();
		
		c.addEmployee("Michael Saylor", 1);
		c.addEmployee("Satoshi Nakamoto", 2);
		c.addEmployee("Max Keiser", 3);
		c.addEmployee("Hal Finney", 4);
		
		List<Company.Employee> employees = c.getEmployees(); 
		
		Collections.sort(employees, Comparator.comparing(Company.Employee::getName));
		
		ListIterator<Company.Employee> listIterator = employees.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		class SortById implements Comparator<Company.Employee> {
			public int compare(Company.Employee a, Company.Employee b) {
				return (int)a.getID() - (int)b.getID();
			}
		}
		
		Collections.sort(employees, new SortById());
		
		for(Company.Employee e: employees) {
			System.out.println(e);
		}
				
	}	
	
}
