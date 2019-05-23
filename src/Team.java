public class Team {
    String teamName;
    Skills[] teamRunner;

    public Team(String teamName, Skills[] runner) {
        this.teamName = teamName;
        teamRunner = new Skills[]{new Android("Verter", 12, 10),
                new People("Misha", 5, 5),
                new Cat("Barsik", 10, 1),
                new Android("Bender", 100, 100)};
    }

    public void teamPresent(Skills[] teamRunner) {
        for (Skills s : teamRunner) {
            s.presentation();
        }

    }


    public void showResultOfTeam(Skills[] teamRunner) {
        for (Skills s : teamRunner) {
            if (s.onTrack()) {
                s.result();
            }

        }
    }
}
