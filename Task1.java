class Task1 {

    public static void main(String[] args) {
        Team team = new Team("Red Team", 1, new String[]{"BOB", "BOBO", "BOOBBY"});


        team.setRank(1);

System.out.println(team.toString());
        System.out.println(team.getTeamName() + ", " + team.getRank());
        System.out.println();
        for (String player : team.getPlayers()) {
            System.out.println(player);
        }
    }

   
	
}
