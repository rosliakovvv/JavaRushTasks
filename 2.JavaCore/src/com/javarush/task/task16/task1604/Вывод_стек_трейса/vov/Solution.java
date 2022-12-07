package com.javarush.task.task16.task1604.Вывод_стек_трейса.vov;

/*
Вывод стек-трейса
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("\n\tStackTrace for main:\n");

        //может не успеть отработать...
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    private static class SpecialThread implements Runnable {

        @Override
        public void run() {

            System.out.println("\n\tStackTrace for thread:\n");

            for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
                System.out.println(e);
            }
        }
    }
}
