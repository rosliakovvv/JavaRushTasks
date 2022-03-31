package com.javarush.task.task16.task1602.My_second_thread.vov2;

public class Solution {
    public static void main(String[] args) {
        ThreadFor1602v2 v2 = new ThreadFor1602v2();
        v2.start();
    }

    private static class ThreadFor1602v2 extends Thread {
        static {
            System.out.println("it's a static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("да идите уже");
        }
    }
}

