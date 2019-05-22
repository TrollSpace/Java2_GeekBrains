public class Main {
    public static void main(String[] args) {
        Skills[] runner = {new Android("Verter", 12, 10),
                new People("Misha", 5, 5),
                new Cat("Barsik", 10, 1)};
        ObstacleCourse[] oc = {new Wall(3), new RunningTrack(7), new Wall(1)};
        startCourse(runner,oc);

//        Android xyz = new Android("Misha", 100, 12);
//        RunningTrack road = new RunningTrack(100);
//        road.doIt(xyz);
//        xyz.result();
    }

    public static void startCourse(Skills[] runner, ObstacleCourse[] oc) {
        if (runner.length > 0) {
            for (Skills r : runner) {
                for (ObstacleCourse c : oc) {
                    c.doIt(r);
                    if(!r.onTrack()){
                        break;
                    }
                }
            }
        }
    }
}
