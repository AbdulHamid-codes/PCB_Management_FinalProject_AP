package  model;



public class Bowler extends Player {

	public double getEconomy() {
		return economy;
	}

	public void setEconomy(double economy) {
		this.economy = economy;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public double getBallsBowled() {
		return ballsBowled;
	}

	public void setBallsBowled(double ballsBowled) {
		this.ballsBowled = ballsBowled;
	}

	public int getRunsConceeded() {
		return runsConceeded;
	}

	public void setRunsConceeded(int runsConceeded) {
		this.runsConceeded = runsConceeded;
	}

	private double economy;

	private int wickets;

	private double ballsBowled;
	
	private int runsConceeded;
	
	@Override
	public void updatePlayerProfile(int runs,int balls, int catches, int wickets, int stumps, boolean motm){
		matchPlayed++;
		ballsBowled += balls;
		noOfCatches += catches;
		if(motm) {
			manOfTheMatchAwards += 1;
		}
		runsConceeded += runs;
		economy = runsConceeded/(ballsBowled/6);
	}
	
	@Override
	public void displayPlayerStats() {
		
	}
}
