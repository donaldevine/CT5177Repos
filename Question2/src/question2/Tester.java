package question2;

import java.util.List;

public class Tester {

	public static void main(String[] args) {
		PersonCollection personCollection = new PersonCollection();
		
		personCollection.addPerson(new Person("Joe Bloggs", 91, "joe@bloggs.com"));		
		personCollection.addPerson(new Person("Jane Bloggs", 93, "jane@bloggs.com"));
		
		FileSerilizationDeserialization<Person> f = new FileSerilizationDeserialization<Person>();
		
		f.serialise(personCollection.getCollection());
		
		List<Person> personList = f.deserialise();
		
		personCollection.printCollection(personList);

	}

}
