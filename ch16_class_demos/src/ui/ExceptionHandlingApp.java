package ui;

public class ExceptionHandlingApp {

	public static void main(String[] args) {
		String nbr = "75.5";
		try {
			int i = Integer.parseInt(nbr);
		} catch (NumberFormatException nfe) {
			System.out.println("error parsing integer");
			System.out.println(nfe.getMessage());
			System.out.println(nfe.toString());
			nfe.printStackTrace(); // does not need a println statement 
			System.err.println(nfe);
		}
	}
}
