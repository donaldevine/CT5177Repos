package question3;


public class Tyres {

	private double wheelDiameter;
	private double tyreWidth;

	public Tyres() {
		this.wheelDiameter = 0;
		this.tyreWidth = 0;
	}

	public void setWheelDiameter(double wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}

	public void setTyreWidth(double tyreWidth) {
		this.tyreWidth = tyreWidth;
	}

	public double getWheelDiameter() {
		return this.wheelDiameter;
	}

	public double getTyreWidth() {
		return this.tyreWidth;
	}

	@Override
	public String toString() {
		return "\nwheelDiameter: " + this.wheelDiameter + "\n" + "tyreWidth"
				+ this.tyreWidth;
	}

}