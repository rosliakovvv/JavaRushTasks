package com.javarush.task.task17.task1702.Вместе_быстрее.vov;

import java.util.ArrayList;
import java.util.List;

public class Sol {

    public static int threadCount = 10;

    public static int[] testArray = new int[1000];

    static {
        for (int i = 0; i < Sol.testArray.length; i++) {
            testArray[i] = i;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        StringBuffer expectedResult = new StringBuffer();
        for (int i = 1000 - 1; i >= 0; i--) {
            expectedResult.append(i).append(" ");
        }

        initThread();

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < testArray.length; i++) {
            result.append(testArray[i]).append(" ");
        }

        System.out.println(result);
        System.out.println(expectedResult);
        System.out.println(result.toString().equals(expectedResult.toString()));
    }

    public static void initThread() throws InterruptedException {

        List<Thread> threads = new ArrayList<>(threadCount);

        for (int i = 0; i < threadCount; i++) {
            threads.add(new SortThread());
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) thread.join();
    }

    private static void sort(int[] array) {
        synchronized (testArray) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        int k = array[i];
                        array[i] = array[j];
                        array[j] = k;
                    }
                }
            }
        }
    }


    public static class SortThread extends Thread {
        @Override
        public void run() {
            Sol.sort(testArray);
        }

    }


}
