
public class ClassByReferenceAndTypeApp {

	public static void main(String[] args) {
		double price = 14.99;
		price = increasePrice(price);
		System.out.println(price);
		

	}

	private static double increasePrice(double p) {
		p = p * 1.1;
		return p;
	}

}
