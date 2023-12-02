package question2;

import java.util.ArrayList;
import java.util.List;

public class PersonCollection {
	
	private ArrayList<Person> personList = null;
			
	public PersonCollection() {		
		personList = new ArrayList<Person>();
	}
	
	public List<Person> getCollection() {
		return this.personList;
	}
	
	public boolean addPerson(Person person) {
		return this.personList.add(person);
	}
	
	public boolean removePerson(Person person) {
		return this.personList.remove(person);
	}
	
	public void printCollection(List<Person> personList) {		
		for(Person p : personList){
			System.out.println(p);
		}
	}	
}
