package com.javarush.task.task16.task1601.My_first_thread.vov_3;

public class Solution {
    public static void main(String[] args) {
        TestThreadThird t3 = new TestThreadThird();
        new Thread(t3).start();

    }

    private static class TestThreadThird implements Runnable{

        @Override
        public void run() {
            System.out.println("Я продолжил обучение снова 10 декабра 2021");
        }
    }
}
