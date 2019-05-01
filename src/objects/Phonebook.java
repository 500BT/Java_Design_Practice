package objects;

import java.util.ArrayList;

public class Phonebook {
	
	ArrayList<Person> personData;
	
	public Phonebook() {
		personData = new ArrayList<Person>();
	}
	
	public void insertData(String firstName, String lastName, String phoneNum) {
		personData.add(new Person(firstName, lastName, phoneNum));
	}
	
	public Person searchPerson(String firstName, String lastName, String phoneNum) {
		System.out.println(personData);
		for (Person nst: personData) {
			if (nst.getFirstName().contentEquals(firstName) &&
					nst.getLastName().contentEquals(lastName) &&
					nst.getPhoneNum().contentEquals(phoneNum)) {
				return nst;
			}
		}
		return null;
	}
	
	public void removeData(Person removed) {
		System.out.println(removed.getFirstName() + removed.getLastName() + " ªË¡¶");
		personData.remove(removed);
	}
	
	public void printBook() {
		for (int i = 0; i < personData.size(); i++) {
			System.out.println(personData.get(i).getFirstName() + personData.get(i).getLastName() + personData.get(i).getPhoneNum());
		}
	}
}
