package Business;
public class Product implements Comparable {
	private String code;
	private String description;
	private double price;
	protected static int count =0;
	
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public Product() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}

	/* 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * Compare product.code to determine if 
	 * two instances are equal
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product p2 = (Product)obj;
			if (code.equalsIgnoreCase(p2.getCode())) {
				return true;
			}
			
		}
		return false;
	}

	@Override
	public int compareTo(Object arg0) {
		// compare products by code
		int c = 0;
		Product p = (Product)arg0;
		c = this.code.compareTo(p.getCode());	
		return c;
	}
	

}