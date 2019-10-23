package ui;

public class StringsApp {

	public static void main(String[] args) {
		String str1 = "Murach's Java Programming";
		
		if (str1.startsWith("Murach's Java Programming")) {
			System.out.println("not case sensitive");
		}
		if (str1.startsWith("Murach's")) {
			System.out.println("case sensitive");
		}
		
		String name1 = "bob l smith";
		System.out.println("name1 = "+name1);
		System.out.println("length = "+name1.length());
		System.out.println(name1.indexOf("b"));
		System.out.println(name1.indexOf("b", 1));
		
		// find first space
		int idx1 = name1.indexOf(" ");
		int idx2 = name1.indexOf(" ", idx1 + 1);
		
		System.out.println(idx1);
		System.out.println(idx2);
		
		String fName = name1.substring(0, idx1);
		String mi = name1.substring(idx1 + 1, idx2);
		String lName = name1.substring(idx2+1);
		System.out.println("fName = " + fName);
		System.out.println("mi = " + mi);
		System.out.println("lName = " +lName);
		
		String name2 = "     Sue     Johnson             ";
		System.out.println(name2);
		System.out.println(name2.length());
		String name3 = name2.trim();
		System.out.println(name3);
		System.out.println(name3.length());
		
		String name4 = "###b##o#b#######";
		String name5 = name4.replace('#',' ');
		System.out.println(name5);
		
		String[] name1Array = name1.split(" ");
		for (String s: name1Array) {
			System.out.println(s);
		}
	}
}
