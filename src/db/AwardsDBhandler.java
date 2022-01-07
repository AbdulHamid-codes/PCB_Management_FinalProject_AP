package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.PCBawards;

public class AwardsDBhandler {

	public boolean saveAward(PCBawards a) {
		
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query1 = " insert into PCBawards (name,year, winner)" + "Values(?, ?,?)";
			
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query1);
		      preparedStmt.setString   (1, a.getAwardName());
		      preparedStmt.setInt  (2, a.getYear());
		      preparedStmt.setString    (3, a.getWinner());

		      
		      // execute the preparedstateme
		      preparedStmt.execute();
		      
		      return true;
			//con.close();
			
		}
		catch(Exception e) {
			//System.out.println(e);
			String s=e.getMessage();
			System.out.println(s);
			//messageInCreateSq.setText(s);
			//return s;
			return false;
       }
	}
}
