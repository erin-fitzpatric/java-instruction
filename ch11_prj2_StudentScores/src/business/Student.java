package business;

public class Student implements Comparable<Student> {
	private String lastName;
	private String firstName;
	private int score;

	public Student() {
		super();
	}

	public Student(String lastName, String firstName, int score) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.score = score;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return lastName + ", "  + firstName + ": " + score;
	}

	@Override
	public int compareTo(Student s1) {
		// sort by name: lastname then firstname
		int comp = 0;
		comp = this.lastName.compareToIgnoreCase(s1.lastName);
		if (comp==0) // lastnames are the same
			comp = this.firstName.compareToIgnoreCase(s1.getFirstName());
		return comp;
	}

}

//		int last = this.lastName.compareTo(o.lastName);
//		return last == 0 ? this.firstName.compareTo(o.firstName) : last;