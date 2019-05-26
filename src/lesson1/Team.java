package lesson1;

public class Team {
    String teamName;
    Skills[] teamRunner;

    public Skills[] getTeamRunner() {
        return teamRunner;
    }

    public Team(String teamName) {
        this.teamName = teamName;
        this.teamRunner = new Skills[]{new Android("Verter", 12, 10),
                new People("Misha", 5, 5),
                new Cat("Barsik", 10, 1),
                new Android("Bender", 100, 100)};
    }

    public void teamPresent() {
        for (Skills s : teamRunner) {
            s.presentation();
        }

    }


    public void showResultOfTeam() {
        for (Skills s : teamRunner) {
            if (s.onTrack()) {
                s.result();
            }

        }
    }
}
