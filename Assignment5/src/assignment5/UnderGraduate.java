package assignment5;


/**
 * UnderGraduate sub class implementation
 */
public class UnderGraduate extends Student {
			
	/** 
	 * Default Constructor
	 */
	public UnderGraduate() {
		super();
	}
	
	/**
	 * Overridden constructor
	 * @param name as string
	 * @param id as long
	 */
	public UnderGraduate(String name, long id) {
		super(name, id);
	}
	
	
	/**
	 * Overridden calculateResults method
	 */
	@Override
	public void calculateResult() {				
		int totalMark = 0;		
		
		for(int i = 0; i < this.getNumTests(); i++) {
			totalMark += this.getTestScore(i);
		}
		
		int averageMark = totalMark / this.getNumTests();
		
		if (averageMark >= 40) {
			this.setGrade("PASS");			
		} else {
			this.setGrade("FAIL");			
		}		
	}
	
}
