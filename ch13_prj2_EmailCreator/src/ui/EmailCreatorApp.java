package ui;

import business.EmailTemplate;
import util.Console;

public class EmailCreatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Email Creator App\n");

		String[] csv = { " james ,butler,jbutler@gmail.com", "Josephine,Darakjy,Josephine_Darakjy@darakjy.org",
				"ART,VENERE,ART@VENERE.ORG" };

		String template = Console.getString("Would you like to see the current email template? (y/n): ");
		if (template.equalsIgnoreCase("y")) {
			EmailTemplate emailTemplate = new EmailTemplate();
			System.out.println(emailTemplate);
		}

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("================================================================");
			String message = Console.getString("\nEnter your email message: ");
			String yourName = Console.getString("\nEnter message signature: ");
			System.out.println("Message sent!");
			for (String c : csv) {
				int idx1 = c.indexOf(",");
				int idx2 = c.indexOf(",", idx1 + 1);

				String fName = Console.toTitleCase((c.substring(0, idx1).toLowerCase().trim()));
				String lName = Console.toTitleCase((c.substring(idx1, idx2).toLowerCase().replace(",", "")));
				String email = c.substring(idx2).toLowerCase().replace(",", "");

				EmailTemplate emailTemplate = new EmailTemplate(fName, lName, email, message, yourName);

				System.out.println(emailTemplate);
			}
			System.out.println("================================================================");
			choice = Console.getString("\nSend another message? (y/n): ");
		}
		System.out.println("\nThanks for using the Email Creator App!");
	}
}
