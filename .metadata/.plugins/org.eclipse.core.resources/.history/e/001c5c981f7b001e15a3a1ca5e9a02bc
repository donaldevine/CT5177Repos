package assignment7;

import java.io.Serializable;


public abstract class Shapes implements ShapesRelate, Serializable {
	protected double area;
	
	public Shapes() {
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public double getArea() {
		return this.area;
	}
	
	
	/**
	 * calculateArea abstract method
	 */
	public abstract void calculateArea();
	
	
	/**
	 * compareShapes method to compare this shape with other shape.
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

}
