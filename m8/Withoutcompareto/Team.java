class Team {
	String team;
	int wins, losses, draws;
	Team(String team, int wins, int losses, int draws) {
		this.team = team;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}
	public String getTeam() {
		return this.team;
	}
	public int getWins() {
		return this.wins;
	}
	public int getLosses() {
		return this.losses;
	}
	public int getDraws() {
		return this.draws;
	}
	public String setTeam(String s) {
		this.team = s;
		return this.team;
	}
}