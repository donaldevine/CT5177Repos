package assignment5;

import java.util.Formatter;

public class Student {
	
	private String name = "";
	private long id = 0;
	private String grade = "";	
	private static final int NUM_TESTS = 3;
	private int[] test = null;
	
	/**
	 * Default Constructor
	 */
	public Student() {
		this.test = new int[NUM_TESTS];
	}
	
	/**
	 * Constructor
	 * @param name as String
	 * @param id as long
	 */
	public Student(String name, long id) {
		this.test = new int[NUM_TESTS];
		this.name = name;
		this.id = id;
	}
	
	//Mutators
	//////////
	
	/**
	 * Sets the name field
	 * @param name as String
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the id field
	 * @param id as long
	 */
	public void setID(long id) {
		this.id = id;
	}
	
	
	/**
	 * Sets the grade
	 * @param grade as String
	 */
	public void setGrade(String grade) {
		this.grade = grade;	
	}
	
	
	/**
	 * Set Test Score
	 * @param test as integer
	 * @param score as integer
	 */
	public void setTestScore(int test, int score) {
		
		if (test >= NUM_TESTS) {
			System.out.println("Invalid test.");
			return;
		}			
		
		if (score > 100) {
			System.out.println("Invalid score.");
			return;
		}
				
		this.test[test] = score;
	}
	
	
	/**
	 * Get Test Score
	 * @param test as integer
	 * @return score as integer
	 */
	public int getTestScore(int test) {	
		return this.test[test];	
	}
	
	/**
	 * Get Number of Tests
	 * @return number of tests as integer
	 */
	public int getNumTests() {
		return NUM_TESTS;
	}
	
	/**
	 * Gets the name 
	 * @return name as string
	 */
	public String getName() {
		return this.name;
	}
	
	
	/**
	 * Gets the id number
	 * @return id as long
	 */	
	public long getID() {
		return this.id;
	}
	
	/**
	 * Gets the grade
	 * @return grade as string
	 */
	public String getGrade() {
		return this.grade;
	}
	
	
	/**
	 * Overridden toString Method
	 */
	@Override
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
	
		try (Formatter formatter = new Formatter(stringBuilder)) {
			String template = "%-5s %-15s %-3s %10d %10s %-4s"; 
	  
			formatter.format(template, "Name:", this.name, "ID:", this.id, "Grade:", this.grade);
		}

		return stringBuilder.toString();		
	}
	
	/**
	 * Method to calculate result
	 */
	public void calculateResult() {		
		
	}

}
