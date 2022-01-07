package  model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.AwardsDBhandler;
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

	// This code has to be in DB handler of awards
	public boolean save() {
		
		AwardsDBhandler a=new AwardsDBhandler();
		return a.saveAward(this);

	}
	public void display() {
		
	}
}
