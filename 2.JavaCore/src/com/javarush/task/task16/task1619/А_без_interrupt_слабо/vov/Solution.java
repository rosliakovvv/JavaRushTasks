package com.javarush.task.task16.task1619.А_без_interrupt_слабо.vov;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        Thread thread = new Thread(testThread);
        thread.start();
        Thread.sleep(2000);
        outInterruptMethod();
    }

    public static void outInterruptMethod() {
        TestThread.isCancel = true;
        System.out.println("Off");
    }

    public static class TestThread implements Runnable {
        public static boolean isCancel = false;

        @Override
        public void run() {
            System.out.println("On");
            while (!isCancel) {
                System.out.println("he-he");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("error");
                }
            }
        }
    }
}
