package assignment7;

/**
 * Rectangle class
 */
public class Rectangle extends Shapes {	
	private double length = 0.0;
	private double width = 0.0;

	/**
	 * Default constructor
	 */
	public Rectangle() {
		this.width = 0.0;
		this.length = 0.0;	
	}
	
	/**
	 * Overloaded constructor
	 * @param width as double
	 * @param length as double
	 */
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	/**
	 * Sets the width of the rectangle
	 * @param width as double
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * Gets the width of the rectangle
	 * @return width as double
	 */
	public double getWidth() {
		return this.width;
	}
		
	/**
	 * Sets the length of the rectangle
	 * @param length as double
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * Gets the length of the rectangle
	 * @return length as double
	 */
	public double getLength() {
		return this.length;
	}
	
	
	/**
	 * Overridden toString method
	 */
	@Override
	public String toString() {
		
		return "Rectangle with a width of " + 
			String.format("%,.2f", this.width) + 
			"cm, a length of " + 
			String.format("%,.2f", this.length) + 
			"cm and an area of " + 
			String.format("%,.2f", this.area) + "cm\u00B2.";
	}
	
	
	/**
	 * Method to calculate the area
	 */
	public void calculateArea() {
		this.area = this.width * this.length;
	}
	
}
