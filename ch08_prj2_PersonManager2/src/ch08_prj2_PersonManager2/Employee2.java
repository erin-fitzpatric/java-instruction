package ch08_prj2_PersonManager2;

public class Employee2 extends Person2 {
	private String ssn;

	public Employee2() {
		super();
	}

	public Employee2(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString()+ "SSN: xxx-xx-"+ssn.substring(7); 
		//substring(x) trims off the number of characters to the left. 
	}
	
}
