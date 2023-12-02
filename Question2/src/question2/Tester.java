package question2;

import java.util.List;

public class Tester {

	public static void main(String[] args) {
		PersonCollection personCollection = new PersonCollection();
		
		personCollection.addPerson(new Person("Joe Bloggs", 91, "joe@bloggs.com"));		
		personCollection.addPerson(new Person("Jane Bloggs", 93, "jane@bloggs.com"));
		personCollection.addPerson(new Person("Satoshi Nakamoto", 14, "satoshi@bitcoin.com"));
		personCollection.addPerson(new Person("Michael Saylor", 102, "michael@saylor.com"));
		
		FileSerilizationDeserialization<Person> f = new FileSerilizationDeserialization<Person>();
		
		f.serialise(personCollection.getCollection());
		
		List<Person> personList = f.deserialise();
		
		personCollection.printCollection(personList);

	}

}
