package ch08_prj2_PersonManager;

public class Customer extends Person {
    private String number;
	
	public Customer (String firstName, String lastName, String number)
	{
		super(firstName, lastName);
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "You entered a new Customer: " + super.toString() + "\n"
		+ "Customer Number: " + number + "\n";
	}
}
