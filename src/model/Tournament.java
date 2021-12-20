package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;




public abstract class Tournament {
	
	private ArrayList<Match> matches;
	protected String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	protected LocalDate startDate;
	protected LocalDate endDate;
	protected String winner;
	protected Player playerOfTheTournament;
	
	
	public ArrayList<Match> getMatches() {
		return matches;
	}

	public void setMatches(ArrayList<Match> matches) {
		this.matches = matches;
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


	public void setEndDate(LocalDate endD) {
		this.endDate = endD;
	}


	public String getWinner() {
		return winner;
	}


	public void setWinner(String winner) {
		this.winner = winner;
	}


	public Player getPlayerOfTheTournament() {
		return playerOfTheTournament;
	}


	public void setPlayerOfTheTournament(Player playerOfTheTournament) {
		this.playerOfTheTournament = playerOfTheTournament;
	}
	

	public abstract void displayDetails();
	
}
