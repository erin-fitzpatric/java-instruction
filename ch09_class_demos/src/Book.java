
public class Book extends Product implements Printable, Cloneable {
	
	private String author;

	public Book() {
		super();
		author = "";
		count++;
	}

	public Book(String code, String description, double price, String author) {
		super(code, description, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString() + " by "+ author;
	}

	@Override
	public void print() {
		System.out.println(super.getDescription() + 
		" by " + author);
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}