package model;


public class WicketKeeper extends Player {
	
	private int noOfStumps;
	
	public int getNoOfStumps() {
		return noOfStumps;
	}

	public void setNoOfStumps(int noOfStumps) {
		this.noOfStumps = noOfStumps;
	}

	@Override
	public void updatePlayerProfile(int runs,int balls, int catches, int wickets, int stumps, boolean motm){
		matchPlayed++;
		ballsFaced += balls;
		noOfCatches += catches;
		if(motm) {
			manOfTheMatchAwards += 1;
		}
		totalRuns += runs;
		
		strikeRate = totalRuns/ballsFaced * 100;
		average = totalRuns/matchPlayed;
		
		noOfStumps += stumps;
	}
	
	@Override
	public void displayPlayerStats() {
		
	}
	
}
