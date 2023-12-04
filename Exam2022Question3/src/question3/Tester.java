package question3;

import java.util.ArrayList;
import java.util.ListIterator;

public class Tester {
	public static void main(String[] args) {
		/*
		 * i. creates an ArrayList and populate it with three instances of the
		 * Automobile class, giving values to each of the variables.
		 */
		ArrayList<Automobile> list = new ArrayList<>();

		list.add(new Automobile(4, "white"));
		list.add(new Automobile(6, "red"));
		list.add(new Automobile(8, "blue"));

		/*
		 * i. change to speed of each of the Automobiles by calling the
		 * accelerate() method
		 */
		for (int i = 0; i < list.size(); i++) {
			list.get(i).accelerate(10);
		}
		/*
		 * iii. display the contents of the ArrayList in both directions using a
		 * ListIterator.
		 */
		System.out.println("Task 3");
		ListIterator<Automobile> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		while (itr.hasPrevious()) {
			System.out.println(itr.previous().toString());
		}
		/*
		 * iv. change the speed of each of the Automobile objects by calling the
		 * slowDown() method
		 */
		for (int i = 0; i < list.size(); i++) {
			list.get(i).slowDown(5);
		}
		/*
		 * v. display the contents of the ArrayList using an enhanced for loop
		 */
		System.out.println("----------\nTask 5");
		for (Automobile a : list) {
			System.out.println(a);
		}
	}
}
