package com.javarush.task.task17.task1702.Вместе_быстрее.test;

public class Test2 {

    static String s1 = "Bob 1";
    static String s2 = "Jack 2";

    public static void main(String[] args) throws InterruptedException {
        Swapper swapper1 = new Swapper();
        Swapper swapper2 = new Swapper();
        swapper1.start();
        swapper2.start();
        System.out.println(s1);
        System.out.println(s2);
    }

    public synchronized static void swap() {
        String s = s1;
        s1 = s2;
        s2 = s;
    }

    public static class Swapper extends Thread {

        @Override
        public void run() {
            swap();
        }
    }
}




