package assignment5;


/**
 * UnderGraduate sub class implementation
 */
public class PostGraduate extends Student {
			
	/** 
	 * Default Constructor
	 */
	public PostGraduate() {
		super();
	}
	
	
	/**
	 * Overridden constructor
	 * @param name as string
	 * @param id as long
	 */
	public PostGraduate(String name, long id) {
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
		
		if (averageMark >= 50) {
			this.setGrade("PASS");
		} else {
			this.setGrade("FAIL");
		}		
	}
}
