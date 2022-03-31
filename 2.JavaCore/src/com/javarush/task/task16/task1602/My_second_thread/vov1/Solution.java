package com.javarush.task.task16.task1602.My_second_thread.vov1;

public class Solution {
    public static void main(String[] args) {
        TestTread thread = new TestTread();
        thread.start();

    }

    private static class TestTread extends Thread {
        static {
            System.out.println("It's a static block");
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }
}

