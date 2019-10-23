package business;

public class EmailTemplate {
	private String firstName = "(first name)";
	private String lastName = "(last name)";
	private String email = "(insert email)";
	private String personalMessage = "Write a personal message here. Talk about our great deal on cats right now (buy one get two free)!";
	private String yourName = "(your signature)";
	
	public EmailTemplate() {
		super();
	}

	public EmailTemplate(String firstName, String lastName, String email, String personalMessage, String yourName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.personalMessage = personalMessage;
		this.yourName = yourName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPersonalMessage() {
		return personalMessage;
	}

	public void setPersonalMessage(String personalMessage) {
		this.personalMessage = personalMessage;
	}
	public String getYourName() {
		return yourName;
	}
	
	public void setYourName(String yourName) {
		this.yourName = yourName;
	}
	

	@Override
	public String toString() {
		return "================================================================\n" + 
				"To: 	 " + email + "\r\n" + 
				"From:    noreply@deals.com\r\n" + 
				"Subject: Deals!\r\n" + 
				"\nHi " + firstName + ",\r\n" + 
				"\n" + personalMessage +
				"\n\nSincerely, \n\n" +
				yourName;
	}
}
