package  model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.dbConnection;

;




public class InternationalTournament extends Tournament {
	
	
	private int totalMatchesPlayed;
	
	private int won;

	private int lost;

	private String teamPosition;
	
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean save() {
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query1 = " insert into international_tournament (name, startDate, endDate)" + "Values(?, ?,?)";
			
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query1);
		      preparedStmt.setString    (1, this.name);
		      preparedStmt.setObject    (2, this.startDate);
		      preparedStmt.setObject   (3, this.endDate);
		      
	
		      // execute the preparedstateme
		      preparedStmt.execute();
		      
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
