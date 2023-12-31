package assignment7;

import java.io.Serializable;

/**
 * Shapes abstract class
 */
public abstract class Shapes implements ShapesRelate, Serializable {
	protected double area;
	
	/**
	 * Default constructor
	 */
	public Shapes() {
		
	}
	
	
	/**
	 * Gets the area of the Shape
	 * @return area as double
	 */
	public double getArea() {
		return this.area;
	}
	
	
	/**
	 * Calculates the area of the shape
	 */
	public abstract void calculateArea();
	
	
	/**
	 * method to compare this shape's area with other shape.
	 * Based on the Java compareTo method.
	 * return 0 if the objects are the same area.
	 * return -1 if this object's area is less than the other.
	 * return 1 if this object's area is greater than the other.
	 * @return integer with result of comparison.
	 */
	public int compareShapes(ShapesRelate shapesRelate) {
		
		Shapes otherShape = (Shapes)shapesRelate;
		
		double thisArea = this.getArea();
		double thatArea = otherShape.getArea();
										
		if(thisArea < thatArea) return -1;
		
		if(thisArea > thatArea) return 1;	
		
		return 0; 
	}

} // end of Shapes class
