package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Squad;

public class SquadDBhandler {

	public String save(Squad sq) {
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query = " insert into squad (type, noOfPlayers)" + "Values(?, ?)";
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString    (1, sq.getType());
		      preparedStmt.setInt    (2, sq.getNumOfPlayers());
	
		      // execute the preparedstateme
		      preparedStmt.execute();

			//con.close();
			return "Successfully Created Squad";
		}
		catch(Exception e) {
			//System.out.println(e);
			String s=e.getMessage();
			//messageInCreateSq.setText(s);
			return s;
       }
	}
	
	public boolean savePlayer(int shirt, String type) {
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query = " insert into squad_player (squadType, shirtNo)" + "Values(?,?)";
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setInt    (1, shirt);
		      preparedStmt.setString    (2, type);
	
		      // execute the preparedstateme
		      preparedStmt.execute();
		      
	
		      // execute the preparedstateme
		      preparedStmt.execute();
			return true;
		}
		catch(Exception e) {
			//System.out.println(e);
			String s=e.getMessage();
			//messageInCreateSq.setText(s);
			return false;
       }
	}
}
