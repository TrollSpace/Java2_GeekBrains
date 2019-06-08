package Lesson5;

import java.util.Arrays;

public class Main {
    public static final int size = 10000000;
    public static int threadCount = 4;
    public static final int h = size / threadCount;
    public static float[] arr = new float[size];

    public static void main(String[] args) {
        oneThreadArray();
        moreThreadArray();
    }

    public static void fillArrayByOne() {
        Arrays.fill(arr, 1);
    }

    public static void oneThreadArray() {
        fillArrayByOne();
        long a = System.currentTimeMillis();
        formula();
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void formula() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void moreThreadArray() {
        fillArrayByOne();
        long a = System.currentTimeMillis();
        for (int i = 1; i < threadCount ; i++) {
            new Thread(new ThreadCalculate(i, arr)).start();
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    static class ThreadCalculate implements Runnable {
        int threadCount;
        float[] arr = new float[h];

        ThreadCalculate(int threadCount, float[] arr){
            this.threadCount = threadCount;
            System.arraycopy(arr,size-h*threadCount, this.arr, 0, h);
        }

        @Override
        public void run() {
            formula();
        }
    }
}
