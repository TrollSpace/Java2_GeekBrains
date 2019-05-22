public class Wall extends ObstacleCourse {
    private int high;

    public Wall(int high) {
        this.high = high;
    }

    @Override
    public void doIt(Skills runner) {
        runner.jump(high);

    }
}
