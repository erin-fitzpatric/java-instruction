package ch05_prj3_GuessingGame;

import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
// print welcome message
		System.out.println("Welcome to the Guess the Number Game \n" + "++++++++++++++++++++++++++++++++++++\n" + "\n"
				+ "I'm thinking of a number from 1 to 100.\n" + "Try to guess it!");
// create scanner, set yes variable
		Scanner sc = new Scanner(System.in);
		String moreCalcs = "y";

		// create while loop is yes
		while (moreCalcs.equalsIgnoreCase("y")) {

			// generate randomNumber between 1-100 via randombNumberGenerator METHOD
			int num = 0;
			int randomNumber = randomNumberGenerator(num);
			// System.out.println(randomNumber); // FOR DEBUGGING ....DELETE THIS LATER

			// set guess = 0
			int guess = 0;

			// create while loop != randomNumber, prompt "enter number", guess = scannerinput
			System.out.print("\n" + "Enter Number: ");
			guess = sc.nextInt();

			// iteration; different messages depending on how far away METHOD
			int i = 1;
			i = tooHighLow(i, guess, randomNumber, sc);

			// print "you got it in" + i + "try" number of guesses message METHOD
			correctGuessMessage(i);

			// Clear the buffer.
			sc.nextLine();

			// while loop prompt continue? (y/n)
			moreCalcs = playAgain(moreCalcs, sc);
		}

		System.out.println("\n" + "Bye - Come back soon!");
		sc.close();

	}

	// generates random number
	public static int randomNumberGenerator(int num) {
		int i = 0;
		i = (int) (Math.random() * 100) + 1;
		return i;
	}
	// message if guess is correct
	public static void correctGuessMessage(int i) {
		if (i == 1) {
			System.out.println("You got it in " + i + " try.");
		} else {
			System.out.println("You got it in " + i + " tries.");
		}

		if (i <= 3) {
			System.out.println("Great work! You are a mathematical wizard.\n");
		} else if (i > 3 && i <= 7) {
			System.out.println("Not too bad! You've got some potential\n");
		} else if (i > 7) {
			System.out.println("What took you so long? Maybe you should take some lessons.\n");
		}
	}
	// message if guess is wrong and prompts for new guess
	public static int tooHighLow(int i, int guess, int randomNumber, Scanner sc) {
		while (guess != randomNumber) {
			// high
			if (guess > randomNumber) {
				if ((guess - 10) > randomNumber) {
					System.out.println("Way too high! Guess again.\n");
				} else if (guess > randomNumber) {
					System.out.println("Too high! Guess again.\n");
				}
			}
			// low
			if (guess < randomNumber) {
				if ((guess + 10) < randomNumber) {
					System.out.println("Way too low! Guess again.\n");
				} else if (guess < randomNumber) {
					System.out.println("Too low! Guess again.\n");
				}
			}
			guess = sc.nextInt();
			i++;
		}
		return i;
	}
	// message to play again or exit
	public static String playAgain(String moreCalcs, Scanner sc) {
		do {
			if (moreCalcs.equals("")) {
				System.out.print("Error! This entry is required.");
			} else if (!moreCalcs.equalsIgnoreCase("y") && !moreCalcs.equalsIgnoreCase("n")) {
				System.out.print("Error! Entry must be 'y' or 'n'.");
			}

			System.out.print("Try again? (y/n): ");
			moreCalcs = sc.nextLine().trim();
		} while (!moreCalcs.equalsIgnoreCase("y") && !moreCalcs.equalsIgnoreCase("n"));
		return moreCalcs;
	}
}
