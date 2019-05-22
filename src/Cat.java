public class Cat {
    String name;
    int jumpHigh;
    int runDistance;

    public Cat(String name, int jumpHigh, int runDistance) {
        this.name = name;
        this.jumpHigh = jumpHigh;
        this.runDistance = runDistance;
    }

    public void run() {
        System.out.println("Кошка побежала");
    }

    public void jump() {
        System.out.println("Кошка прыгнула");
    }
}
