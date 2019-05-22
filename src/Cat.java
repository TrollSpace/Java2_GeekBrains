public class Cat implements Skills {
    private String name;
    private int jumpHigh;
    private int runDistance;
    private boolean onTrack;

    public Cat(String name, int jumpHigh, int runDistance) {
        this.name = name;
        this.jumpHigh = jumpHigh;
        this.runDistance = runDistance;
        this.onTrack = true;
    }

    @Override
    public void run(int trackLength) {
        if (onTrack && runDistance >= trackLength) {
            System.out.println("Кошка пробежала " + trackLength + ".");
        } else {
            System.out.println("Кошка ушла спать");
            onTrack = false;
        }
        ;
    }

    @Override
    public void jump(int wallHigh) {
        if (onTrack && jumpHigh >= wallHigh) {
            System.out.println("Кошка перепрыгнула стену высотой - " + wallHigh + ".");
        } else {
            System.out.println("Кошка шмякнулась");
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
