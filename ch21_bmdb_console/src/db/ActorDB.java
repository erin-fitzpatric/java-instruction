package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;


public class ActorDB extends BaseDB {
	// list Actor
	public List<Actor> listActor() {
		// create empty array
		List<Actor> actorList = new ArrayList<>();
		// SQL statement
		String sql = "SELECT * from actor";
		// get connection to db
		try (PreparedStatement ps = getConnection().prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Actor a = getActorFromResultSet(rs);
				actorList.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return actorList;
	}
	
	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {
		// Get a movie from the result set
		int id = rs.getInt(1);
		String firstName = rs.getString(2);
		String lastName = rs.getString(3);
		String gender = rs.getString(4);
		LocalDate birthDate = rs.getDate(5).toLocalDate();
		Actor a = new Actor(id, firstName, lastName, gender, birthDate);
		return a;
	}
	
	// get movie
		public Actor get(int id) {
			// create movie instance
			Actor actor = null;
			// SQL statement
			String sql = "SELECT * from actor " +
						"WHERE id = ?";
			// get connection to db
			try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				// edit sql
				ps.setInt(1, id);
				 ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					actor = getActorFromResultSet(rs);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return actor;
		}
	// add Actor 
		public int add(Actor a) {
			int rowCount = 0;
			// SQL
			String sql = "insert into Actor (firstName, lastName, gender, birthDate) values (?, ?, ?, ?)";
			// Connection
			try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				// Edit
				ps.setString(1, a.getFirstName());
				ps.setString(2, a.getLastName());
				ps.setString(3, a.getGender());
				ps.setObject(4, a.getBirthDate());
				// Execute
				rowCount = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// Return
			return rowCount;
		}

	// Update Actor 
		public int update(Actor a) {
			int rowCount = 0;
			// SQL
			String sql = "update actor set firstName = ? where id = ?";
			// Connection
			try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				// Edit
				ps.setString(1,  a.getFirstName());
				ps.setInt(2, a.getId());

				// Execute
				rowCount = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// Return
			return rowCount;
		}

	// Delete Actor 
		public int delete(Actor a) {
			int rowCount = 0;
			// SQL
			String sql = "delete from Actor where id = ?";
			// Connection
			try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				// Edit
				ps.setInt(1, a.getId());
				// Execute
				rowCount = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// Return
			return rowCount;
		}
}