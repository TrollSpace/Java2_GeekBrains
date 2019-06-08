package Lesson5;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void fillArrayByOne() {
        for (int x = 0; x<arr.length; x++) {
            arr[x] = 1;
        }

    }
}
