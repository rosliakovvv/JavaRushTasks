package com.javarush.task.task16.task1624.Последовательные_выполнения_нитей.vov;

public class Solution {
    static MyThread mt = new MyThread();
    static String msg = "from main";

    public static void main(String[] args) throws InterruptedException {
        mt.start();
        mt.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(msg);
            sleep();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static class MyThread extends Thread {
        public String msg2 = "from MyThread";

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(msg2);
                Solution.sleep();
            }
        }
    }
}

