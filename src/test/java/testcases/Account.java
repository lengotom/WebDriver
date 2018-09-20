package testcases;

import java.sql.*;

public class Account {

	public Connection getConn() throws SQLException {
		Connection conn = null;
		String url = "www.bla.bla.bla.bla.pl";
		String user = "abc";
		String password = "pass";
		conn = DriverManager.getConnection(url, user, password);
		
		return conn;
	}
	
	public void withdraw (int amount) throws SQLException {
		getConn();
		
	}
}
