package Lesson5;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void main(String[] args) {
        oneThreadArray();
    }

    public static void fillArrayByOne() {
        Arrays.fill(arr, 1);
    }

    public static void oneThreadArray() {
        fillArrayByOne();
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis()-a);
    }
}
