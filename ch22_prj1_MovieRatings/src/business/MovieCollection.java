package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import business.Movie;

public class MovieCollection {
	private List<Movie> movieList;
	
	public MovieCollection() {
		movieList = new ArrayList<>();
	}
	
	// get movie list
	public List<Movie> getMovieList() {
		return movieList;
	}

	// set movie list
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	
	// add movie
	public void add(Movie m) {
		movieList.add(m);
	}

	// filter movies
	public List<Movie> filterMovies(Predicate<Movie> condition) {
		List<Movie> filteredMovies = new ArrayList<>();

		for (Movie m : movieList) {
			if (condition.test(m)) {
				filteredMovies.add(m);
			}
		}
		return filteredMovies;
	}
	
	// get lowest rating
	public double getLowestRating() {
		double lowestRating = movieList.stream()
				.map(m -> m.getRating())
				.reduce(5.0, (a,b) -> Math.min(a, b));
		return lowestRating;
	}
	
	// get highest rating
	public double getHighestRating() {
		double highestRating = movieList.stream()
				.map(m -> m.getRating())
				.reduce(0.0, (a,b) -> Math.max(a, b));
		return highestRating;
	}
	
	// get average rating
		public double getAverageRating() {
			double sum = movieList.stream()
					.mapToDouble(m -> m.getRating())
					.sum();
			return sum / movieList.size();
		}
		
	// get size 
		public int getSize() {
			return movieList.size();
		}
	
}
