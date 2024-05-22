package SelfPracticeTrial;

public class Team {
    String name;
    int points;
    int wins;
    int draws;
    int losses;
    int goalsFor;
    int goalsAgainst;

    public Team(String name) {
        this.name = name;
        this.points = 0;
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
        this.goalsFor = 0;
        this.goalsAgainst = 0;
    }

    public void updateStats(int goalsFor, int goalsAgainst) {
        this.goalsFor += goalsFor;
        this.goalsAgainst += goalsAgainst;
        if (goalsFor > goalsAgainst) {
            this.wins++;
            this.points += 3;
        } else if (goalsFor == goalsAgainst) {
            this.draws++;
            this.points += 1;
        } else {
            this.losses++;
        }
    }

    @Override
    public String toString() {
        return name + " - Points: " + points + ", Wins: " + wins + ", Draws: " + draws + ", Losses: " + losses +
                ", Goals For: " + goalsFor + ", Goals Against: " + goalsAgainst + ", Goal Difference: "
                + (goalsFor - goalsAgainst);
    }
}
