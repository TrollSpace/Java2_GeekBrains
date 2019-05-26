package lesson1;

public class Course {
    ObstacleCourse[] courses;

    public Course(ObstacleCourse[] courses) {
        this.courses = courses;
    }

    public void doIt(Team team){
        Skills[] teamRunner = team.getTeamRunner();
        if (teamRunner.length > 0) {
            for (Skills r : teamRunner) {
                for (ObstacleCourse c : courses) {
                    c.doIt(r);
                    if(!r.onTrack()){
                        break;
                    }
                }
            }
        }

    }
}
