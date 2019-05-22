public class Android implements Skills {
    String name;
    int jumpHigh;
    int runDistance;
    boolean onTrack;

    public Android(String name, int jumpHigh, int runDistance) {
        this.name = name;
        this.jumpHigh = jumpHigh;
        this.runDistance = runDistance;
        this.onTrack = true;
    }

    @Override
    public void run(int trackLength) {
        if (onTrack && runDistance >= trackLength) {
            System.out.println("Робот пробежал " + trackLength + ".");
        } else {
            System.out.println("Робот сошел с дистанции");
            onTrack = false;
        }
        ;
    }

    @Override
    public void jump(int wallHigh) {
        if (onTrack && jumpHigh >= wallHigh) {
            System.out.println("Робот перепрыгнул стену высотой - " + wallHigh + ".");
        } else {
            System.out.println("Робот сошел с дистанции");
            onTrack = false;
        }
        ;
    }

    @Override
    public boolean onTrack() {
        return onTrack;
    }

    @Override
    public void result() {
        System.out.println(name + (onTrack ? ("finish") : ("fail")));
    }

}
