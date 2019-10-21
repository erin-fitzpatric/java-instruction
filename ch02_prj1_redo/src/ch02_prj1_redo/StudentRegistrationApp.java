package ch02_prj1_redo;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Student Registration From");
		String first = Console.getString("Enter First Name: ");
		String last = Console.getString("Enter Last Name: ");
		int birthYear = Console.getInt("Enter year of birth: ");
		
		System.out.println("\nWelcome " + first + " " + last);
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + first + "*" + birthYear);
	}

}
