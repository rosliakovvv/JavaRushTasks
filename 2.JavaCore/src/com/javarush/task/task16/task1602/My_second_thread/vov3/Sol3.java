package com.javarush.task.task16.task1602.My_second_thread.vov3;

public class Sol3 {
    public static void main(String[] args) {
        TestThread_v3 testThread_v3 = new TestThread_v3();
        testThread_v3.start();
        TestThread_v3 testThread_v3_2 = new TestThread_v3();
        testThread_v3_2.start();


    }

    public static class TestThread_v3 extends Thread {
        static {
            // выведется только один раз
            System.out.println("it's a static block");
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }

}
