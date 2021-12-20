package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import db.dbConnection;

public class Admin {
	private String username;
	private String password;
	
	public Admin(String uname, String pass){
		username=uname;
		password=pass;
	}
	public boolean validate() {
		try {

			Connection con=dbConnection.getConnection();
			Statement stmt  = con.createStatement();
			String sql = "SELECT * " +
		             "FROM admin ";

		ResultSet rs    = stmt.executeQuery(sql);
		
		while (rs.next()) {
			String uname=rs.getString("username");
			String pass=rs.getString("password");
			
			if(uname.equals(this.username) && pass.equals(pass)) {
				return true;
			}		
		}
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
			//String s=e.getMessage();
			//messageInCreateSq.setText(s);
		}
		
		return false;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
