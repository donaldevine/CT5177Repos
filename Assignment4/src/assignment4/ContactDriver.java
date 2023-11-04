package assignment4;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ContactDriver {
	public static void main(String[] args) {

		///////////////////////////////////////////////////////////////
		// Create an ArrayList and populate it with 4 Contact objects.
		///////////////////////////////////////////////////////////////
		
		ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
		
		contactArrayList.add(new Contact("Andrew Porter", 1));
		contactArrayList.add(new Contact("Dan Sheehan", 2));
		contactArrayList.add(new Contact("Tadhg Furlong", 3));
		contactArrayList.add(new Contact("Tadhg Beirne", 4));
		
		
		///////////////////////////////////////////////////////////////
		// Use a ListIterator to traverse the list
		// in both directions displaying its contents.
		///////////////////////////////////////////////////////////////

		ListIterator<Contact> iterator = contactArrayList.listIterator();
		
		System.out.println("Traversing the list forwards: ");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
				
		System.out.println(" ");
		System.out.println("Traversing the list backwards: ");
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}

		
		///////////////////////////////////////////////////////////////
		// Display the size of the list
		///////////////////////////////////////////////////////////////

		System.out.printf("%nThe size of the list is %d%n", 
				contactArrayList.size());
		
		
		///////////////////////////////////////////////////////////////
		// Request the user to input the name of a contact in the list
		///////////////////////////////////////////////////////////////		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input the name of a contact in the list: ");		
		String nameToFind = input.nextLine();
		
		int index = 0;
		boolean nameFound = false;
		
		
		///////////////////////////////////////////////////////////////
		// Use an enhanced for loop to search the list for the 
		// contact name given by
		// the user and return the index of it location.
		///////////////////////////////////////////////////////////////			
		
		for(Contact c : contactArrayList) {			
			if(c.getName().equals(nameToFind.trim())) 
			{
				index = contactArrayList.indexOf(c);
				System.out.printf("%nName found, the index is %d%n", 
						index);
				nameFound = true;
				break;				
			}			
		}
		
		
		///////////////////////////////////////////////////////////////
		// Remove the contact 
		///////////////////////////////////////////////////////////////	
		
		if(nameFound) { 
			System.out.println("Removing contact from the list....");
			contactArrayList.remove(index);
		} else {
			System.out.println("Name not found.");
		}
		
		
		///////////////////////////////////////////////////////////////
		// Use an enhanced for loop to display the contents of the list. 
		///////////////////////////////////////////////////////////////	
		
		System.out.println(" ");
		System.out.println("Contents of the list: ");
		for(Contact c: contactArrayList) {
			System.out.println(c);
		}
						
		
	}
}
