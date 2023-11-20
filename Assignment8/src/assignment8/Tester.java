package assignment8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Tester {
	public static void main(String[] args) {
		
		//Populate linked list with Cats and Dogs
		LinkedList<Animal> animals = new LinkedList<Animal>();
		
		animals.add(new Dog("Cerberus", "Boerboel", 80));		
		animals.add(new Dog("Bear", "Belgian Malinois", 60));
		animals.add(new Dog("Ghost", "Cane Corso", 70));		
		animals.add(new Dog("Sceolang", "Irish Wolfhound", 90));
		animals.add(new Cat("Garfield", "Persian Tabby", 25));
		animals.add(new Cat("Grumpy Cat", "Domestic Cat", 30));
		

		System.out.println(" ");
		System.out.println("Original list of animals: ");
		
		// Display contents of the list
		for(Animal a: animals) {
			System.out.println(a);
		}
		
		
		System.out.println(" ");
		System.out.println("Sorted list of animals: ");
		//Sort list using Collections.sort
		Collections.sort(animals);
		
		//Display the list
		for(Animal a: animals) {
			System.out.println(a);
		}			
		
		
		//Using inner class to compare animals using breed
		Tester tester = new Tester();				
		BreedComparator breedComparator = tester.new BreedComparator();
		
		//sort animals by breed
		Collections.sort(animals, breedComparator);		
		
		System.out.println(" ");
		System.out.println("List of animals sorted by Breed: ");
		
		//display sorted list
		for(Animal a: animals) {
			System.out.println(a);
		}
		
		
		//Using inner class to compare animals using size
		SizeComparator sizeComparator = tester.new SizeComparator();		
		
		//sort animals by size
		Collections.sort(animals, sizeComparator);		
		
		System.out.println(" ");
		System.out.println("List of animals sorted by Size: ");
		
		//display sorted list		
		for(Animal a: animals) {
			System.out.println(a);
		}
		
		String filename = "animals.dat";
		
		//Serialize the list
		serializeAnimals(animals, filename);		
		
		//De-serialize the list
		LinkedList<Animal> deserializedAnimals =  deserializeAnimals(filename);
		
		System.out.println(" ");
		System.out.println("De-serialised list of Animals: ");		
		
		//display the list
		for(Animal a: deserializedAnimals) {
			System.out.println(a);
		}
				
	}
	
	
	/**
	 * Inner comparator class
	 */
	class BreedComparator implements Comparator<Animal> {		
		public int compare(Animal a, Animal b) {
			return a.getBreed().compareTo(b.getBreed());
		}
	}
	
	/**
	 * Inner comparator class
	 */
	class SizeComparator implements Comparator<Animal> {
		public int compare(Animal a, Animal b) {
			return a.getSize() - b.getSize();
		}		
	}
	
	
	/**
	 * Method to serialize animals
	 * @param linkedlist list of animals
	 * @param fileName as string
	 */
	public static void serializeAnimals(LinkedList<Animal> linkedlist, String fileName) {
		try{
			
			FileOutputStream fileStream = new FileOutputStream(fileName);
			
			ObjectOutputStream outputStream = new ObjectOutputStream(fileStream);			
			
			outputStream.writeObject(linkedlist);
			
			outputStream.close();
			
		} catch(Exception e) {
			e.printStackTrace();			
		}
	}

	
	/**
	 * Method to deserialize animals
	 * @param fileName as string
	 * @return ListList of animals
	 */
	public  static LinkedList<Animal> deserializeAnimals(String fileName) {
		
		LinkedList<Animal> animals = null; 
		
		try {
			FileInputStream fileStream = new FileInputStream(fileName);
			
			ObjectInputStream inputStream = new ObjectInputStream(fileStream);
			
			animals = (LinkedList<Animal>)inputStream.readObject();
					
			inputStream.close();				
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return animals;
	}

}
