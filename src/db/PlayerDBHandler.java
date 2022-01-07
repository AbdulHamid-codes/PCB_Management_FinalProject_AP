package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Player;

public class PlayerDBHandler {

	public boolean save(Player p, String sq) {
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query1 = " insert into player (shirtNo, name)" + "Values(?, ?)";
			String query2 = " insert into squad_player (squadType, shirtNo)" + "Values(?,?)";
			
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query1);
		      preparedStmt.setInt    (1, p.getShirtNo());
		      preparedStmt.setString    (2, p.getName());
	
		      // execute the preparedstateme
		      preparedStmt.execute();
		      
		      PreparedStatement preparedStmt2 = con.prepareStatement(query2);
		      preparedStmt2.setString    (1, sq);
		      preparedStmt2.setInt    (2, p.getShirtNo());
	
		      // execute the preparedstateme
		      preparedStmt2.execute();
		      
		      return true;
			//con.close();
			
		}
		catch(Exception e) {
			//System.out.println(e);
			String s=e.getMessage();
			//messageInCreateSq.setText(s);
			//return s;
			return false;
       }
	}
}
