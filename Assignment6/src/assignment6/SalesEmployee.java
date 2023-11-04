package assignment6;

import java.util.Formatter;
import java.util.Locale;
import java.text.NumberFormat;


/**\
 * SalesEmployee abstract class 
 */
abstract class SalesEmployee {
	private String firstName = "";
	private String lastName = "";	
	private String ppsNumber = "";
	private static int bikeEmployeeNumber;
	protected double sales = 0.0;
	protected double commission = 0.0;
	private int employeeNumber = 0;
		
	/**
	 * Default Constructor
	 */
	public SalesEmployee() {	
		this.firstName = "";
		this.lastName = "";
		this.ppsNumber = "";
		this.employeeNumber = bikeEmployeeNumber++;
	}
	
	
	/**
	 * Overridden Constructor
	 * @param firstName as string
	 * @param lastName as string
	 * @param ppsNumber as string
	 */
	public SalesEmployee(String firstName, String lastName, String ppsNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ppsNumber = ppsNumber;
		this.employeeNumber = ++bikeEmployeeNumber;
	}
	
	
	/**
	 * Setter for First Name
	 * @param firstName as string
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Setter for Last Name 
	 * @param lastName as string
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Setter for PPS Number
	 * @param ppsNumber as string
	 */
	public void setPPS(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}
	
	
	/**
	 * Getter for First Name 
	 * @return firstName as string
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * Getter for Last Name
	 * @return lastName as string
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	
	/**
	 * Getter for PPS Number
	 * @return PPS Number as string
	 */
	public String getPPS() {
		return this.ppsNumber;
	}
	
	
	/**
	 * Getter for Employee Number
	 * @return Employee Number as string
	 */
	public int getEmployeeNumber() {
		return this.employeeNumber;
	}
	
	
	/**
	 * Overridden toString method
	 */
	@Override
	public String toString() {				
		Locale locale;
		
		StringBuilder stringBuilder = new StringBuilder();
		
		locale = new Locale("ie", "IE");
			    
	    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
				
		
		try (Formatter formatter = new Formatter(stringBuilder)) {
			String template = "%-11s %-10s %-10s %-10s %-10s %-10s %-11s %-3d %-6s %12s %14s %12s"; 
	  
			formatter.format(template, 
					"First Name:", this.firstName, 
					"Last Name:", this.lastName, 
					"PPS Number:", this.ppsNumber,
					"Employee No.:", this.employeeNumber,
					"Sales:", numberFormat.format(this.sales),
					"Commission:", numberFormat.format(this.commission));					
		}

		return stringBuilder.toString();
		
	}
	
	
	/**
	 * Abstract calculateCommission method
	 */
	public abstract void calculateCommission();

} // End of SalesEmployee class
