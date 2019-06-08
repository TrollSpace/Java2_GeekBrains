package Lesson5;

import java.util.Arrays;

public class Main {

    public static final int size = 10000000;
    public static int threadCount = 2;  // Можно менять колличество потоков. Но четными, реализация со всеми вариантами будет в 2.0 =)))
    public static final int h = size / threadCount;
    public static float[] arrMain = new float[size];

    public static void main(String[] args) {
        oneThreadArray();
        moreThreadArray();
    }

    public static void fillArrayByOne() {
        Arrays.fill(arrMain, 1);
    }

    private static void formula(float[] arrMain) {
        for (int i = 0; i < arrMain.length; i++) {
            arrMain[i] = (float) (arrMain[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void oneThreadArray() {
        fillArrayByOne();
        long a = System.currentTimeMillis();
        formula(arrMain);
        System.out.println("Подсчет в один поток: " + (System.currentTimeMillis() - a) + "мс");
    }

    public static void moreThreadArray() {
        fillArrayByOne();
        long b = System.currentTimeMillis();
        Thread[] threads = new Thread[threadCount];
        float[][] array2d = new float[threadCount][h];
        for (int i = 0; i < threadCount; i++) {
            System.arraycopy(arrMain, size - h * (threadCount), array2d[i], 0, h);
            threads[i] = new Thread(new ThreadCalculate(i, array2d[i]));
        }
        System.out.println("Разбивка на массивы: " + (System.currentTimeMillis() - b) + "мс");
        for (Thread th : threads) {
            th.start();
            try {
                th.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < array2d.length; i++) {
            System.arraycopy(array2d[i], 0, arrMain, i * h, h);

        }
        System.out.println("Подсчет в " + threadCount + " потока: " + (System.currentTimeMillis() - b) + "мс");
    }


    static class ThreadCalculate extends Thread {
        int threadCount;

        float[] arr;

        ThreadCalculate(int threadCount, float[] arr) {
            this.threadCount = threadCount;
            this.arr = arr;
        }

        @Override
        public void run() {
            long timeBeforeFormula = System.currentTimeMillis();
            formula(arr);
            System.out.println("Время обработки " + threadCount + ": " +
                    +(System.currentTimeMillis() - timeBeforeFormula) + "мс");
        }
    }
}
