package  model;

public class Batsman extends Player {
	
	@Override 
	public void updatePlayerProfile(int runs, int balls, int catches, int wickets, int stumps, boolean motm){
		matchPlayed++;
		ballsFaced += balls;
		noOfCatches += catches;
		if(motm) {
			manOfTheMatchAwards += 1;
		}
		totalRuns += runs;
		
		strikeRate = totalRuns/ballsFaced * 100;
		average = totalRuns/matchPlayed;
	}
	
	
	@Override
	public void displayPlayerStats() {
		
	}
}
