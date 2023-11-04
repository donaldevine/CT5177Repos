package assignment6;

/**
 * SalesPerson Class derives from SaleEmployee abstract class  
 */
public class SalesPerson extends SalesEmployee {
	
	/**
	 * Default Constructor
	 */
	public SalesPerson() {
		super();		
	}
	
	/**
	 * Overridden Constructor
	 * @param firstName as string
	 * @param lastName as string
	 * @param ppsNumber as string
	 */
	public SalesPerson(String firstName, String lastName, String ppsNumber){		
		super(firstName, lastName, ppsNumber);
	}
	
	/**
	 * calculateCommission abstract method implementation 
	 */
	public void calculateCommission() {
		this.commission = this.sales * 0.15;		
	}
	
} // End of SalesPerson class
