package ch02_class_demos;

import java.util.Scanner;

public class DataTypesApp {

	public static void main(String[] args) {
		String fName = "Bob";
		String lName = "Smith";
		
		String fullName = fName + " " + lName;
		
		System.out.println(fullName);

		double price = 49.99;
		
		System.out.println(fullName+" "+price);
		
		String fn1 = "Bob";
		String ln1 = "Marley";
		
		String name = "";
		// name = name += fn1;
		name += fn1;			// same as line above
		name += " ";
		name += ln1;
	
		System.out.println(name);
		
		int n1 = 5;
		n1 +=10; 	// 15
		System.out.println(n1);
		n1 -=2;		// 13
		System.out.println(n1);
		n1 *=2;		// 26
		System.out.println(n1);
		n1 /=5;		// 5	 
		
		double d1 = (double)n1/5;
		n1 /=5;		// 5	 
		System.out.println(n1);
		System.out.println(d1);
		
		String s1 = "This is a para-\ngraph.	"
				+ "It takes up\nmultiple lines "
				+ "and uses a\ttab.";
		System.out.println(s1);
		
	
		Scanner sc  = new Scanner(System.in);
//		
//		System.out.println("Enter Something: ");
//		String str = sc.nextLine();
//		System.out.println("You entered: "+str);
//		
//		System.out.println("Enter a double: ");
//		double d2 = sc.nextDouble();
//		System.out.println("You entered: "+d2);
//		
//		System.out.println("Enter a int: ");
//		double i1 = sc.nextInt();
//		System.out.println("You entered: "+i1);
//		
		System.out.println("Enter 4 words: ");
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		String str4 = sc.next();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
								
		sc.close();		
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.print(".");
	}
}