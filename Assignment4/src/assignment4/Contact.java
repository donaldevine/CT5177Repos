package assignment4;

public class Contact {
	
	/**
	 * Instance variables 
	 */	
	private String name = "";
	private long number = 0;
	
	/**
	 * Default Constructor
	 */
	public Contact() {
		this.name = "";
		this.number = 0;
	}

	
	/**
	 * Overridden Constructor
	 * @param name parameter as string
	 * @param number parameter as long
	 */
	public Contact(String name, long number) {
		this.name = name;
		this.number = number;
	}
	
	// Assessors
	////////////
			
	/**
	 * Public getter for name field
	 * @return name as string
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Public getter for number field
	 * @return number as long
	 */
	public long getNumber() {
		return this.number;
	}
	
	
	// Mutators
	////////////
	
	/**
	 * Public setter for name field
	 * @param name parameter as string
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Public setter for number field
	 * @param number as long
	 */
	public void setNumber(long number) {
		this.number = number;
	}
	
	
	/**
	 * Overridden toString() Method
	 */
	@Override
	public String toString() {
		return "Name: " + this.name + "; " +
				"Number: " + this.number + ". ";		
	}
	
} // end of Contact class
