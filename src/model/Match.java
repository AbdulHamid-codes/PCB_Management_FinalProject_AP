package model;


import java.time.LocalTime;
import java.util.Date;

public class Match {
	
	private String venue ;
	private Date date;
	private LocalTime time;
	private Player manOfTheMatch;
	
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public Player getManOfTheMatch() {
		return manOfTheMatch;
	}
	public void setManOfTheMatch(Player manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}


}
