class Team {
	String teamname;
	int wins;
	int losses;
	int draws;
	Team() {

	}
	Team(String teamname, int wins, int losses, int draws) {
		this.teamname = teamname;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}
	String getTeamname() {
		return this.teamname;
	}
	int getWins() {
		return this.wins;
	}
	int getDraws() {
		return this.draws;
	}
	int getLosses() {
		return this.losses;
	}
	int compareTo(Team that) {
		if (this.getWins() > that.getWins()) {
	        return 1;
	    } else if (this.getWins() < that.getWins()) {
	        return -1;
	    } else {
	    	if (this.getLosses() > that.getLosses()) {
		        return -1;
		    } else if (this.getLosses() < that.getLosses()) {
		        return 1;
		    } else {
		    	if (this.getDraws() > that.getDraws()) {
			        return 1;
			    } else if (this.getDraws() < that.getDraws()) {
				    return -1;
				} else {
					return 0;
				}
		    }
	    }

	}
}