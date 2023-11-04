package assignment6;

/**
 * SalesAgent Class derives from SaleEmployee abstract class  
 */
public class SalesAgent extends SalesEmployee {
	
	/**
	 * Default Constructor
	 */
	public SalesAgent() {
		super();		
	}
	
	
	/**
	 * Overridden Constructor
	 * @param firstName as string
	 * @param lastName as string
	 * @param ppsNumber as string
	 */
	public SalesAgent(String firstName, String lastName, String ppsNumber) {
		super(firstName, lastName, ppsNumber);		
	}
	
	
	/**
	 * calculateCommission abstract method implementation 
	 */
	public void calculateCommission() {
		this.commission = this.sales * 0.10;
	}
	
} // End of SalesAgent class
