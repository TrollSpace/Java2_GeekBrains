public class Main {
    public static void main(String[] args) {
        Android xyz = new Android("Misha", 100, 12);
        RunningTrack road = new RunningTrack(100);
        road.doIt(xyz);
        xyz.result();
    }
}
