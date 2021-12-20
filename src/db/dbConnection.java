package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
	
	private static Connection con;
	
	private dbConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "tiger12345");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static Connection getConnection() {
		if(con==null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 con=DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/testdb", "root", "tiger12345");
			}
			catch(Exception e) {
				System.out.println(e);
		}
	}
		return con;
	}
}
