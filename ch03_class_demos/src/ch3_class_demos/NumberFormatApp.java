package ch3_class_demos;

import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		double d1 = .2533333333333;
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		NumberFormat pf = NumberFormat.getPercentInstance();
		pf.setMinimumFractionDigits(2);
		pf.setMaximumFractionDigits(4);
		
		System.out.println(cf.format(d1));
		System.out.println(pf.format(d1));
	}

}
