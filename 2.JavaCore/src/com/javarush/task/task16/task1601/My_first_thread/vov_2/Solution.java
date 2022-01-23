package com.javarush.task.task16.task1601.My_first_thread.vov_2;

public class Solution {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        new Thread(testThread).start();

    }

    public static class TestThread implements Runnable {
        @Override
        public void run() {
            System.out.println("My first thread. Shit )");
        }
    }

}
