package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDB {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/stuffy_db?useSSL=false";
		String username = "stuffy_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}

	// Get function
	public Stuffy get(int id) {
		// SQL statement 
		String sql = "select * from stuffy " + "where id = " + id;
		// Create instance of Stuffy
		Stuffy s = null;
		// Connect to DB and Execute
		try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery(sql);) {
			// result set has a stuffy
			// process the result set row
			boolean stuffyExists = rs.next();
			if (stuffyExists) {
				// Process the result set
				int id2 = rs.getInt(1);
				String type = rs.getString(2);
				String color = rs.getString(3);
				String size = rs.getString(4);
				int limbs = rs.getInt(5);
				
				// enter rs into Stuffy
				s = new Stuffy(id2, type, color, size, limbs); // create instance of stuffy
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// return stuffy
		return s;
	}

	public int add(Stuffy s) {
		int rowCount = 0;
		// SQL statement
		String sql = "INSERT INTO Stuffy (Type, Color, Size, Limbs) " + "VALUES (?, ?, ?, ?)";
		// Connect to DB
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			// Edit SQL
			ps.setString(1, s.getType());
			ps.setString(2, s.getColor());
			ps.setString(3, s.getSize());
			ps.setInt(4, s.getLimbs());
			// Execute SQL
			rowCount = ps.executeUpdate();
		} catch (SQLException se) {
			System.out.println(se);
		}
		// Return rows
		return rowCount;
	}

	// TODO list

	public List<Stuffy> list() {
		// SQL statement
		String sql = "select * from stuffy";
		// Instance of Stuffy
		Stuffy s = null;
		// Create array
		List<Stuffy> stuffyList = new ArrayList<>();
		// Connect to DB and execute SQL
		try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
			// result set has a stuffy... process the result set row
			while (rs.next()) {
				// building stuffy from rs
				int id2 = rs.getInt(1);
				String type = rs.getString(2);
				String color = rs.getString(3);
				String size = rs.getString(4);
				int limbs = rs.getInt(5);
				
				// appending rs to array
				s = new Stuffy(id2, type, color, size, limbs); // create instance of stuffy
				stuffyList.add(s);
			}
			// returning array
			return stuffyList;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// edit
	public void editStuffy(Stuffy s, int id) {
		// SQL Statement
		String sql = "UPDATE stuffy SET " 
					+ "type = ?, " 
					+ "color = ?, " 
					+ "size = ?, " 
					+ "limbs = ? "
					+ "WHERE id = ?";
		// Connect to DB
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
				// Edit SQL
				ps.setString(1, s.getType());
				ps.setString(2, s.getColor());
				ps.setString(3, s.getSize());
				ps.setInt(4, s.getLimbs());				
				ps.setInt(5, id);
				// Execute
				ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
	}

	// delete
	public void deleteStuffy(int id) {
		// SQL statement
		String sql = "DELETE FROM stuffy "
					+ "WHERE id = ?";
		// Connect to DB
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			// Edit SQL
			ps.setInt(1,id);
			// Execute
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
	}
}
