package com.javarush.task.task16.task1601.My_first_thread.vov1;

public class Solution {
    public static void main(String[] args) {
        TestTread test = new TestTread();
        Thread thread = new Thread(test);
        thread.start();
    }

    private static class TestTread implements Runnable{
        @Override
        public void run() {
            System.out.println("Hello, guis! Are you use treads?");
        }
    }
}
