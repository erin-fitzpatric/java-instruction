package ch07_prj1_ContactList;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	public Contact() {
		firstName = "";
		lastName = "";
		email = "";
		phone = "";
	}

	public Contact(String inFirstName, String inLastName, String inEmail, String inPhone) {
		firstName = inFirstName;
		lastName = inLastName;
		email = inEmail;
		phone = inPhone;
	}

	public void setFirstName(String name) {
		firstName = name;
	}
	
	public String getFirstName () {
		return firstName;
	}

	public void setLastName(String name) {
		lastName = name;
	}
	public String getLastName() {
		return lastName;
	}

	public void setEmail(String inEmail) {
		email = inEmail;	
	}
	public String getEmail() {
		return email;
	}

	public void setPhone(String inPhone) {
		phone = inPhone;
	}
	public String getPhone() {
		return phone;
	}
 
	public void displayContact() {
		System.out.println("Name:          " + firstName + " " + lastName);
		System.out.println("Email Address: " + email);
		System.out.println("Phone Number:  " + phone);
	}
}
