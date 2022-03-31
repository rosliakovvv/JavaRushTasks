package com.javarush.task.task16.task1601.My_first_thread.vov4;

public class Sol {
    public static void main(String[] args) {
        TestThread_v4 testThread_v4 = new TestThread_v4();

        Thread thread_v4 = new Thread(testThread_v4);
        thread_v4.start();

    }

    public static class TestThread_v4 implements Runnable{
        @Override
        public void run() {
            System.out.println("my first thread");
        }
    }


}
