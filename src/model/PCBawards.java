package  model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.dbConnection;

public class PCBawards {
	
	private String awardName;
	
	private int year;
	
	private String winner;
	
	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String w) {
		this.winner = w;
	}

	public boolean save() {
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query1 = " insert into PCBawards (name,year, winner)" + "Values(?, ?,?)";
			
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query1);
		      preparedStmt.setString   (1, this.awardName);
		      preparedStmt.setInt  (2, this.year);
		      preparedStmt.setString    (3, this.winner);

		      
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
	public void display() {
		
	}
}
