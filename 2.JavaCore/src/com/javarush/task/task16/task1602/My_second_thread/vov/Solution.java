package com.javarush.task.task16.task1602.My_second_thread.vov;

public class Solution {

    public static void main(String[] args) {
        TestTread thread1 = new TestTread();
        TestTread thread2 = new TestTread();
        thread1.start();
        thread2.start();
    }

    private static class TestTread extends Thread {

        // Сработает только один раз (при инициализации)
        static {
            System.out.println("It's a static block inside TestThread");
        }
        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }
}

