package ch08_prj2_PersonManager;

public class Employee extends Person {
    private String socialSecurity;
	
	public Employee (String firstName, String lastName, String socialSecurity)
	{
		super(firstName, lastName);
		this.socialSecurity = socialSecurity;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	@Override
	public String toString() {
		return "You entered a new Employee: " + super.toString() + "\n"
		+ "SSN: " + socialSecurity + "\n";
	}
}


