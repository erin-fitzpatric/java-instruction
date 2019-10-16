
public class Car {
	private int id;
	public static int NUM_WHEELS = 4;
	public static int objectCount = 0;
	
	
	// empty constructor 
	public Car() {
		id = 0;
		objectCount++;
	}
	
	// constructor accepting a parameter
	public Car(int i) {
		id = i;
		objectCount++;
		
	}
	
	// getter method
	public int getId() {
		return id;
	}
	
	// setter method 
	public void setId(int i) {
		id = i;
	}
	
	// toString method
	public String toString() {
		return "Car: id =  " + id + ", objectCount="+objectCount;
	}
}
