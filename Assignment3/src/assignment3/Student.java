package assignment3;

public class Student {
	
	/**
	 * Instance variables 
	 */
	private String name = "";
	private long idNumber = 0;
	
	/**
	 * Default Constructor
	 */
	public Student() {
		this.name = "";
		this.idNumber = 0;
	}
	
	/**
	 * Overridden Constructor
	 * @param name parameter as string
	 * @param idNumber parameter as long
	 */
	public Student(String name, long idNumber) {
		// 
		this.name = name;
		this.idNumber = idNumber;		
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
	 * Public setter for idNumber field
	 * @param idNumber
	 */
	public void setID(long idNumber) {
		this.idNumber = idNumber;		
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
	 * Public getter for idNumber field
	 * @return idNumber as long
	 */
	public long getID() {
		return this.idNumber;
	}
	
	/**
	 * Override toString() Method
	 */
	@Override
	public String toString() 
	{
		return "Student Name: " + this.name + 
				"; Student ID: " + this.idNumber + ". ";  
	}	
	
} // end of Student class
