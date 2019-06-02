package lesson1;

public class RunningTrack extends ObstacleCourse {
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Skills runner) {
        runner.run(distance);

    }
}
