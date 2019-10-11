import java.util.Scanner;

public class StudentRegistrationApp {
	
	public static void main(String[] args) {
		// Display "Student Registration Form
        System.out.println("Student Registration Form");
        System.out.println();  // print a blank line
        
        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        // define variables
        String firstName = "";
        String lastName = "";
        int birthYear = 0; 
        String fullName = firstName + " " + lastName;
        String tempPassword = firstName + "*" + birthYear;
        
        // prompt user for first name, last name, and birth year
        System.out.println("Enter first name: ");
        firstName = sc.next();
        
        System.out.println("Enter last name: ");
        lastName = sc.next();

        System.out.println("Enter year of birth as YYYY: ");
        birthYear = sc.nextInt();
        
        // Print welcome firstName lastName!
        String message = "Welcome " + firstName + " " + lastName + "!" + "\n" 
                + "Your registration is complete." + "\n"
                + "Your temporary password is: " + firstName + "*" + birthYear + "\n";          
        System.out.println(message);
	}
}
