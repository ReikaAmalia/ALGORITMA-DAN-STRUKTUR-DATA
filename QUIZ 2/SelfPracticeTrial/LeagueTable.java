package SelfPracticeTrial;

public class LeagueTable {
    DoubleLinkedList teams;

    public LeagueTable() {
        teams = new DoubleLinkedList();
    }

    public void addTeam(String name) {
        teams.addTeam(new Team(name));
    }

    public void updateMatchResult(String teamA, String teamB, int goalsForA, int goalsForB) {
        teams.updateTeam(teamA, goalsForA, goalsForB);
        teams.updateTeam(teamB, goalsForB, goalsForA);
        System.out.println(teamA + " vs " + teamB + ": " + goalsForA + "-" + goalsForB);
    }

    public void displayTable() {
        System.out.println("\n--- League Table ---");
        teams.printTable();
    }

    public void displayChampion() {
        Node champion = teams.head; // Assuming the list is sorted
        System.out.println("\njuaranya adalah: " + champion.team.name + " with " + champion.team.points + " points.");
    }

    public static void main(String[] args) {
        LeagueTable league = new LeagueTable();

        // Menambahkan tim-tim EPL
        league.addTeam("Arsenal");
        league.addTeam("Aston Villa");
        league.addTeam("Bournemouth");
        league.addTeam("Brentford");
        league.addTeam("Brighton & Hove Albion");
        league.addTeam("Burnley");
        league.addTeam("Chelsea");
        league.addTeam("Crystal Palace");
        league.addTeam("Everton");
        league.addTeam("Fulham");
        league.addTeam("Liverpool");
        league.addTeam("Luton Town");
        league.addTeam("Manchester City");
        league.addTeam("Manchester United");
        league.addTeam("Newcastle United");
        league.addTeam("Nottingham Forest");
        league.addTeam("Sheffield United");
        league.addTeam("Tottenham Hotspur");
        league.addTeam("West Ham United");
        league.addTeam("Wolverhampton Wanderers");

        // Contoh hasil pertandingan
        league.updateMatchResult("Manchester United", "Chelsea", 3, 1);
        league.updateMatchResult("Liverpool", "Arsenal", 1, 0);
        league.updateMatchResult("Manchester City", "Tottenham Hotspur", 4, 1);
        league.updateMatchResult("Newcastle United", "West Ham United", 2, 0);
        league.updateMatchResult("Aston Villa", "Bournemouth", 1, 2);
        league.updateMatchResult("Brentford", "Brighton & Hove Albion", 2, 1);
        league.updateMatchResult("Crystal Palace", "Everton", 0, 0);
        league.updateMatchResult("Fulham", "Luton Town", 3, 2);
        league.updateMatchResult("Burnley", "Sheffield United", 1, 1);
        league.updateMatchResult("Wolverhampton Wanderers", "Nottingham Forest", 2, 3);
        league.updateMatchResult("Arsenal", "Chelsea", 2, 2);
        league.updateMatchResult("Manchester United", "Liverpool", 2, 3);
        league.updateMatchResult("Manchester City", "Newcastle United", 3, 2);
        league.updateMatchResult("Tottenham Hotspur", "West Ham United", 1, 1);
        league.updateMatchResult("Aston Villa", "Brentford", 1, 0);
        league.updateMatchResult("Bournemouth", "Crystal Palace", 2, 2);
        league.updateMatchResult("Brighton & Hove Albion", "Everton", 0, 1);
        league.updateMatchResult("Fulham", "Burnley", 2, 0);
        league.updateMatchResult("Luton Town", "Sheffield United", 1, 3);
        league.updateMatchResult("Wolverhampton Wanderers", "Arsenal", 0, 4);

        // Menampilkan tabel klasemen
        league.displayChampion();

        league.displayTable();
    }
}
