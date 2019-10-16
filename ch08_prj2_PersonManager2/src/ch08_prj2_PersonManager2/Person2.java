package ch08_prj2_PersonManager2;

public class Person2 {
	private String firstName;
	private String lastName;
	
	public Person2() {
		super();
	}

	public Person2(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\n";
	}
	
}
