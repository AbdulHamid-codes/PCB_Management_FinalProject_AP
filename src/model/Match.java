package model;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Match {
	
	private String venue ;
	private LocalDate date;
	private LocalTime time;
	private String manOfTheMatch;
	
	public Match() {
		
	}
	public Match(String v, LocalDate d, LocalTime t,String p ) {
		venue=v;
		date=d;
		time=t;
		manOfTheMatch=p;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getManOfTheMatch() {
		return manOfTheMatch;
	}
	public void setManOfTheMatch(String manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}


}
