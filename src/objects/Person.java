package objects;

public class Person {
	
	private String firstName;
	private String lastName;
	private String phoneNum;
	
	Person(String firstName, String lastName, String phoneNum) {
		setAttribute(firstName, lastName, phoneNum);
	}
	
	public void setAttribute(String firstName, String lastName, String phoneNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNum() {
		return this.phoneNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person compared = (Person)obj;
		return (this.firstName.contentEquals(compared.firstName) &&
				this.lastName.contentEquals(compared.lastName) &&
				this.phoneNum.contentEquals(compared.phoneNum)); 
	}
}
