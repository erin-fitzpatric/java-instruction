package business;

public class Movie {
	private int id;
	private String title;
	private String rating;
	private int year;
	private String director;
	public Movie() {
		super();
	}
	public Movie(int id, String title, String rating, int year, String director) {
		super();
		this.id = id;
		this.title = title;
		this.rating = rating;
		this.year = year;
		this.director = director;
	}
	public Movie(String title, String rating, int year, String director) {
		super();
		this.title = title;
		this.rating = rating;
		this.year = year;
		this.director = director;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", rating=" + rating + ", year=" + year + ", director="
				+ director + "]";
	}
	
	
	
}

