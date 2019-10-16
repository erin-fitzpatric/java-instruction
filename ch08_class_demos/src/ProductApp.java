

public class ProductApp {

	public static void main(String[] args) {
		Book b = new Book ("java", "Murach's java", 57.50, "Joel Murach");
		
		System.out.println("Book B = " + b);
		
		Software s = new Software("netbeans", "NetBeans", 0.0, "8.2");
		
		System.out.println("Software s = " +s);

		// demonstrate polymorphism 
		Product p;
		
		p = b;
		
		System.out.println("Product toString " + p.toString());
		System.out.println("Author "+b.getAuthor());
		 // System.out.println("Author: "+p.getAuthor); // does not work
		
		p = s;
		System.out.println("Product toString: "+p.toString());
	}

}
