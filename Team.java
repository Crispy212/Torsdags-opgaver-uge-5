class Team{

 private String teamName;
    private int teamRank;
    private String[] playerNames;
	
	 public Team(String teamName, int teamRank, String[] playerNames) {
        this.teamName = teamName;
        this.teamRank = teamRank;
        this.playerNames = playerNames;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getRank() {
        return teamRank;
    }

    public String[] getPlayers() {
        return playerNames;
    }

    public void setRank(int rank) {
        this.teamRank = rank;
    }
	
	/*public String toString(){
	return "Hold: " + teamName + "rang: " + teamRank;
	}*/
	
	public String toString() {
    return "Team: " + teamName + ", Rank: " + teamRank; // Adjusted the format for better clarity
}







}