package ch3_class_demos;

public class MathAndFormattingApp {

	public static void main(String[] args) {
		// rounding a number
		double x = 10.315;
		System.out.println(Math.round(x));
		
		double rx = ((double)Math.round(x*100))/100;
		System.out.println(rx);
		
		// random # between 1 and 10
		int x1 = (int) (Math.random()*10)+1;
		System.out.println(x1);
		
		// max / min
		System.out.println(Math.max(2, 8));
		System.out.println(Math.min(2, 8));

	}
}


