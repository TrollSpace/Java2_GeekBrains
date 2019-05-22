public class RunningTrack {
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    public void doIt(Skills runner){
        runner.run(distance);

    }
}
