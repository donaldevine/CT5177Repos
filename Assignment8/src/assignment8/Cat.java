package assignment8;

public class Cat extends Animal {

	private static final long serialVersionUID = 1L;

	/**
	 * Overridden constructor
	 * @param name as string
	 * @param breed as string
	 * @param size as integer
	 */
	public Cat(String name, String breed, int size) {
		super(name, breed, size);
	}
	
	/**
	 * Sound method
	 * @return sound as string
	 */
	public String sound() {
		return "Meow";
	}
}
