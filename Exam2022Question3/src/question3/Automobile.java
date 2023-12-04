package question3;

public class Automobile implements VehicleSpeed {
	
	private int numSeats = 0;
	private int speed = 0;
	private String colour = "";
	protected Tyres tyres = null;
	
	public Automobile() {
		
	}
	
	public Automobile(int numSeats, String colour) {
		this.numSeats = numSeats;
		this.colour = colour;
	}
	
	public void setSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getSeats() {
		return this.numSeats;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public void accelerate(int speed) {
		this.speed = speed;
	}
	
	public void slowDown(int speed) {
		this.speed = speed;
	}
	
	public String toString() {
		return "Colour: " + this.colour;
	}
	
}
