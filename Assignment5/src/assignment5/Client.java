package assignment5;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		

		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < students.length; i++) {
			System.out.print("Type 1 for UnderGraduate, 2 for Postgraduate: ");
			
			int selection = input.nextInt();
			input.nextLine();
			
			if(selection != 1 && selection != 2) {
				System.out.println("Invalid selection.");
				continue;
			}
			
			String name = "";
			long id = 0;
						
			System.out.print("Enter the Student's Name: ");
			name = input.nextLine();			
						
			System.out.print("Enter the Student's ID: ");
			id = input.nextLong();
			
			
			Student student = null;
			
			if(selection == 1) {
				student = new UnderGraduate(name, id);
			}
			
			if(selection == 2) {
				student = new PostGraduate(name, id);
			}
						
			
			for(int j = 0; j < student.getNumTests(); j++) {
				System.out.printf("Score for %s on test %d: ", student.getName(), j + 1);
				int score = input.nextInt();
				student.setTestScore(j, score);
			}
			
			student.calculateResult();
			
			students[i] = student;
			
		}
		
		
		input.close();
		
		System.out.println("");
		System.out.println("Student Results: ");
		System.out.println("===============");
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				System.out.println(students[i]);
			}
		}				
		
	}
}
