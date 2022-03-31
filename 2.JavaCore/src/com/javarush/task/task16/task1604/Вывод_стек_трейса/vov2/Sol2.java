package com.javarush.task.task16.task1604.Вывод_стек_трейса.vov2;

public class Sol2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element + " 1");
        }
    }

    public static class SpecialThread implements Runnable {

        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element + " 2");
            }
        }
    }
}
