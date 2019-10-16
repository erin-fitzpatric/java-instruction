
public class EqualsDemo {

	public static void main(String[] args) {
		Book b1 = new Book("java", "Murach's Java", 59.50, "Joel Murach");
		Book b2 = new Book("java", "Murach's Java", 59.50, "Joel Murach");

		String s1 = "java";
		String s2 = "java";

		if (s1.equals(s2)) {
			System.out.println("s1 and s2 have the same value");
		}

		if (b1 == b2) {
			System.out.println("b1 and b2 are the same object");
		} else if (b1.equals(b2)) {
			System.out.println("b1 and b2 have the same values");
		} else {
			System.out.println("b1 and b2 are not the same and don't have same values");
		}

	}

}
