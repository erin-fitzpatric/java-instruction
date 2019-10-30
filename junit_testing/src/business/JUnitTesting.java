package business;

public class JUnitTesting {

	// int square(int nbr): accepts an int and returns the int squared
	public int square(int nbr) {
		int nbrSquared = (nbr * nbr);
		return nbrSquared;
	}

	// + int countA(String str): accepts a String and returns an int
	public int countA(String str) {
		int count = 0;
		// representing the number of times the letter 'a' occurs (either lower or upper case)
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
				count++;
		}
		return count;
	}
}
