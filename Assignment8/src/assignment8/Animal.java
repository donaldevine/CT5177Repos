package assignment8;

import java.io.Serializable;

public abstract class Animal implements Comparable<Animal>, Serializable {
		
	/**
	 * private variables
	 */
	private static final long serialVersionUID = 1L;
	private String name = "";
	private String breed = "";
	private int size = 0;
	
	/**
	 * Default Constructor
	 */
	public Animal() {		
		
		this.name = "";
		this.breed = "";
		this.size = 0;		
	}
	
	
	/**
	 * Overridden constructor
	 * @param name as string
	 * @param breed as string
	 * @param size as integer
	 */
	public Animal(String name, String breed, int size) {
		this.name = name;
		this.breed = breed;
		this.size = size;		
	}
	
	
	/**
	 * Overridden compareTo method
	 */
	@Override
	public int compareTo(Animal other) {
		return this.name.compareTo(other.name);		
	}
	
	
	/**
	 * Name setter 
	 * @param name as string
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * name getter
	 * @return name as string
	 */
	public String getName() {
		return this.name;
	}
	
	
	/**
	 * breed setter
	 * @param breed as string
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	/**
	 * breed getter
	 * @return as string
	 */
	public String getBreed() {
		return this.breed;
	}

	
	/**
	 * size setter
	 * @param size as integer
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	
	/**
	 * size getter
	 * @return size as integer
	 */
	public int getSize() {
		return this.size;
	}
	
	
	/**
	 * Overridden toSting method.
	 * @return string
	 */
	@Override
	public String toString() {
		return "Name: " + this.name + 
				". Breed: " + this.breed + 
				". Size: " + this.size + ".";
	}
}
