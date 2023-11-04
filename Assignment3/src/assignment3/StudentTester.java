package assignment3;

public class StudentTester {
	public static void main(String[] args) {
		
		// Create an array of Students to hold 15 Student objects
		Student[] students = new Student[15];
						
		// Add Students to the array
		students[0] = new Student("Andrew Porter", 1);
		students[1] = new Student("Rob Herring", 2);
		students[2] = new Student("Tadhg Furlong", 3);
		students[3] = new Student("Joe McCarthy", 4);
		students[4] = new Student("James Ryan", 5);
		students[5] = new Student("Tadhg Beirne", 6);
		students[6] = new Student("Peter O'Mahony", 7);
		students[7] = new Student("Caelan Doris", 8);
		students[8] = new Student("Jamison Gibson-Park", 9);
		students[9] = new Student("Johnny Sexton", 10);
		students[10] = new Student("James Lowe", 11);
		students[11] = new Student("Bundee Aki", 12);
		students[12] = new Student("Garry Ringrose", 13);
		students[13] = new Student("Keith Earls", 14);
		students[14] = new Student("Hugo Keenan", 15);
		
		System.out.println("List of Students: ");
		System.out.println("================= ");
		
		// loop through students array and print out string from 
		// overridden toString() implementation
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}		
		
	} // end of main method
} // end of StudentTester class

