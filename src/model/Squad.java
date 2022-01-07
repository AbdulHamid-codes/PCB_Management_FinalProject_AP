package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import db.SquadDBhandler;
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
	// This code has to be in DB handler of Squad
	public String saveSquad() {
		
		SquadDBhandler s=new SquadDBhandler();
		return s.save(this);
		
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
		SquadDBhandler s=new SquadDBhandler();
		return s.savePlayer(shirt, type);
		
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
