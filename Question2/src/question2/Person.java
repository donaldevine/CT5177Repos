package question2;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String name = "";
	private int age = 0;
	private String emailAddress = "";
	
	public Person(String name, int age, String emailAddress) {
		this.name = name;
		this.age = age;
		this.emailAddress = emailAddress;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getEmailAddres() {
		return this.emailAddress;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + 
				". Age: " + this.age +
				". Email: " + this.emailAddress;
	}
}
