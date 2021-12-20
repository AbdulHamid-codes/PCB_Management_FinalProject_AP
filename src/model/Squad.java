package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import db.dbConnection;

public class Squad {

	private int numOfPlayers;

	private ArrayList<Player> players;
	
	private String type;
	
	public Squad(int n, String t){
		numOfPlayers=n;
		type=t;
	}
	public Squad(){
		
	}
	public String saveSquad() {
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query = " insert into squad (type, noOfPlayers)" + "Values(?, ?)";
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString    (1, this.type);
		      preparedStmt.setInt    (2, this.numOfPlayers);
	
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

	public int getNumOfPlayers() {
		return numOfPlayers;
	}
	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public boolean addPlayer(int shirt, String type) {
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
	public boolean removePlayer(int shirt) {
		boolean flag=false;
		for(Player p: players) {
			if(p.getShirtNo() == shirt) {
				players.remove(p);
				flag=true;
			}
		}
		return flag;
	}
	public boolean substitutePlayer(int shirt, Player p) {
		boolean flag=false;
		for(Player p1 : players) {
			if(p1.getShirtNo()==shirt) {
				players.remove(p1);
				players.add(p);
				flag=true;
			}
		}
		return flag;
	}
	public void displaySquad() {
		
	}
}
