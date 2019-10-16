
public class Software extends Product {
	private String version;

	public Software(String string, String string2, double d, String string3) {
		super();
	}

	// imported from generate structures from superclass
	public Software(String code, String description, double price) {
		super(code, description, price);
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return super.toString() + " " + version;
	}
	
	
	
}
