package ch07_prj1_ContactList2;

public class ContactList2 {
	// Instance Variables
	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	// Constructors--- Right click, source, generate constructors ....1 time blank and 1 time with all checked

	public ContactList2() {
		super();
	}

	public ContactList2(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

// Getters and setters --- Right click, source, generate getters and setters
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ContactList2 [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
	// format display of the contact here
	public String displayContact() {
		String str = "\n--------------------------------\n";
		str += "------- Current Contact --------\n";
		str += "--------------------------------\n";
		str += "Name:          "+firstName+ " " + lastName + "\n";
		str += "Email Address: "+email + "\n";
		str += "Phone Number:  "+phone+ "\n";
		str += "--------------------------------\n";
		return str;
	}

}

