package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieDB extends BaseDB {
	// list Movie
	public List<Movie> list() {
		// create empty array
		List<Movie> movieList = new ArrayList<>();
		// SQL statement
		String sql = "SELECT * from movie";
		// get connection to db
		try (PreparedStatement ps = getConnection().prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Movie m = getMovieFromResultSet(rs);
				movieList.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return movieList;
	}

	public int add(Movie m) {
		int rowCount = 0;
		// SQL
		String sql = "insert into Movie (title, rating, year, director) values (?, ?, ?, ?)";
		// Connection
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			// Edit
			ps.setString(1, m.getTitle());
			ps.setString(2, m.getRating());
			ps.setInt(3, m.getYear());
			ps.setString(4, m.getDirector());
			// Execute
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Return
		return rowCount;
	}

	// Update Movie
	public int update(Movie m) {
		int rowCount = 0;
		// SQL
		String sql = "update Movie set year = ? where id = ?";
		// Connection
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			// Edit
			ps.setInt(1, m.getYear());
			ps.setInt(2, m.getId());

			// Execute
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Return
		return rowCount;
	}

	// Delete Movie
	public int delete(Movie m) {
		int rowCount = 0;
		// SQL
		String sql = "delete from Movie where id = ?";
		// Connection
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			// Edit
			ps.setInt(1, m.getId());
			// Execute
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Return
		return rowCount;
	}

	private Movie getMovieFromResultSet(ResultSet rs) throws SQLException {
		// Get a movie from the result set
		int id = rs.getInt(1);
		String title = rs.getString(2);
		String rating = rs.getString(3);
		int year = rs.getInt(4);
		String director = rs.getString(5);
		Movie m = new Movie(id, title, rating, year, director);
		return m;
	}

	// get movie
	public Movie get(int id) {
		// create movie instance
		Movie movie = null;
		// SQL statement
		String sql = "SELECT * from movie " +
					"WHERE id = ?";
		// get connection to db
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			// edit sql
			ps.setInt(1, id);
			 ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				movie = getMovieFromResultSet(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return movie;
	}

}
