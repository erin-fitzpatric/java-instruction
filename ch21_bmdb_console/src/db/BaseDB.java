package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// connection to db method
public class BaseDB {
	protected Connection getConnection() throws SQLException {
		// double check this address if you have errors!
		String dbUrl = "jdbc:mysql://localhost:3306/bmdb?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "bmdb_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}
}
