package assignment7;

/**
 * Circle class
 */
public class Circle extends Shapes {	
	private double radius = 0.0;
	private static final double PI = Math.PI; 
	
	/**
	 * Default constructor
	 */
	public Circle() {
		this.radius = 0.0;
	}
	
	/**
	 * Overloaded constructor
	 * @param radius as double
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Sets the radius of the circle
	 * @param radius as double
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	/**
	 * Gets the radius of the circle
	 * @return radius as double
	 */
	public double getRadius() {
		return this.radius;
	}
	
	
	/**
	 * Method to calculate the area of the shape
	 */
	public void calculateArea() {
		this.area = (PI * this.radius * this.radius);
	}
	
	/**
	 * Overridden toString method
	 */
	@Override 
	public String toString() {
		 
		return "Circle with a radius of " + 
				String.format("%,.2f", this.radius) + 
				"cm and an area of " + 
				String.format("%,.2f", this.area) + "cm\u00B2.";
	}
	
} // end of Circle class
