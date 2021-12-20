package  model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.dbConnection;

;


public class DomesticTournament extends Tournament {
	
	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	public int getNoOfTeams() {
		return noOfTeams;
	}

	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}

	private String results;
	
	private int noOfTeams;
	
	public boolean save() {
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query1 = " insert into domestic_tournament (noOfTeams, startDate, endDate)" + "Values(?, ?,?)";
			
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query1);
		      preparedStmt.setInt    (1, this.noOfTeams);
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
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}

}
