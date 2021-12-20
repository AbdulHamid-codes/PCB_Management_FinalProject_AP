package  model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import db.dbConnection;


public class Series {
	
	private String format;
	
	private String type;
	
	private String host;
	
	private String result;
	
	private Player manOfTheSeries;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private int noOfMatches;
	

	private ArrayList<Match> matches;
	
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	
	public Series(String f, String t, String h, LocalDate sDate, LocalDate eDate){
		format=f;
		type=t;
		host=h;
		startDate=sDate;
		endDate=eDate;
	}
	public Series() {
		
	}
	public ArrayList<Match> getMatches() {
		return matches;
	}
	public void setMatches(ArrayList<Match> matches) {
		this.matches = matches;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Player getManOfTheSeries() {
		return manOfTheSeries;
	}
	public void setManOfTheSeries(Player manOfTheSeries) {
		this.manOfTheSeries = manOfTheSeries;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void displayDetail() {
		
	}
	public boolean checkFixtureOFMatch(LocalDate d) {
		
		for(Match m : matches) {
			if(m.getDate()==d)
				return true;
		}
		
		return false;
	}
	
	public boolean Save() {
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query1 = " insert into series (fromat,type, host, startDate, endDate)" + "Values(?, ?,?,?,?)";
			
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query1);
		      preparedStmt.setString   (1, this.format);
		      preparedStmt.setString    (2, this.type);
		      preparedStmt.setString    (3, this.host);
		      preparedStmt.setObject    (4, this.startDate);
		      preparedStmt.setObject   (5, this.endDate);
		      
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
