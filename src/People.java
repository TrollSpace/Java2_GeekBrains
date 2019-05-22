public class People {
    String name;
    int jumpHigh;
    int runDistance;

    public People(String name, int jumpHigh, int runDistance) {
        this.name = name;
        this.jumpHigh = jumpHigh;
        this.runDistance = runDistance;
    }

    public void run() {
        System.out.println("Человек побежал");
    }

    public void jump() {
        System.out.println("Человек прыгнул");
    }
}
