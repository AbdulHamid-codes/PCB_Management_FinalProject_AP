 package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Date;

import db.dbConnection;

public abstract class Player {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getShirtNo() {
		return shirtNo;
	}
	public void setShirtNo(int shirtNo) {
		this.shirtNo = shirtNo;
	}
	public int getMatchPlayed() {
		return matchPlayed;
	}
	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	public int getBallsFaced() {
		return ballsFaced;
	}
	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	public double getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(double strikeRate) {
		this.strikeRate = strikeRate;
	}
	public int getNoOfCatches() {
		return noOfCatches;
	}
	public void setNoOfCatches(int noOfCatches) {
		this.noOfCatches = noOfCatches;
	}
	public int getManOfTheMatchAwards() {
		return manOfTheMatchAwards;
	}
	public void setManOfTheMatchAwards(int manOfTheMatchAwards) {
		this.manOfTheMatchAwards = manOfTheMatchAwards;
	}
	
	protected String name;
	
	protected LocalDate dob;
	
	protected int shirtNo;
	
	protected int matchPlayed;
	
	protected double average;
	
	protected int totalRuns;
	
	protected int ballsFaced;
	
	protected double strikeRate;
	
	protected int noOfCatches;
	
	protected int manOfTheMatchAwards;
	
	public boolean savePlayer(String sq) {
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query1 = " insert into player (shirtNo, name)" + "Values(?, ?)";
			String query2 = " insert into squad_player (squadType, shirtNo)" + "Values(?,?)";
			
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query1);
		      preparedStmt.setInt    (1, this.shirtNo);
		      preparedStmt.setString    (2, this.name);
	
		      // execute the preparedstateme
		      preparedStmt.execute();
		      
		      PreparedStatement preparedStmt2 = con.prepareStatement(query2);
		      preparedStmt2.setString    (1, sq);
		      preparedStmt2.setInt    (2, this.shirtNo);
	
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
	
	public abstract void updatePlayerProfile(int runs,int balls, int catches, int wickets, int stumps, boolean motm);
	public abstract void displayPlayerStats();
	

}


