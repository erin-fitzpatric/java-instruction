package ch08_prj2_PersonManager2;

public class Customer2 extends Person2 {
	private String customerNumber;

	public Customer2() {
		super();
	}

	public Customer2(String firstName, String lastName, String customerNumber) {
		super(firstName, lastName);
		this.customerNumber = customerNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return super.toString()+ "Customer Number: " + customerNumber;
	}

}
