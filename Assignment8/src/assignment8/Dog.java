package assignment8;

public class Dog extends Animal {
	
	/**
	 * Overridden constructor
	 * @param name as string
	 * @param breed as string
	 * @param size as integer
	 */
	public Dog(String name, String breed, int size) {
		super(name, breed, size);
	}
	
	/**
	 * Sound method
	 * @return string
	 */
	public String Sound() {
		return "Bark";
	}

}
