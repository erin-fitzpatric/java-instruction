package ch02_prj2_GradeConvertorRedo;

public class GradeConverterRedoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter\n");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int numGrade = Console.getInt("Enter numerical grade: ");
			while (numGrade < 1 || numGrade > 100) {
				System.out.println("Grade must be between 1 and 100!\n");
				numGrade = Console.getInt("Enter numerical grade: ");
			}
			if (numGrade <= 59) {
				System.out.println("Letter Grade: F");
			} else if (numGrade >= 60 && numGrade <= 66) {
				System.out.println("Letter Grade: D");
			} else if (numGrade >= 67 && numGrade <= 79) {
				System.out.println("Letter Grade: C");
			} else if (numGrade >= 80 && numGrade <= 87) {
				System.out.println("Letter Grade: B");
			} else
				System.out.println("Letter Grade: A");
			choice = Console.getString("\nContinue? (y/n): ");
			
			while (!choice.equalsIgnoreCase("y") && !choice.contentEquals("n")) {
				System.out.println("Error! Choice must be 'n' or 'y'!");
				choice = Console.getString("\nContinue? (y/n): ");
			}

			System.out.println("Good bye!");
		}
	}
}