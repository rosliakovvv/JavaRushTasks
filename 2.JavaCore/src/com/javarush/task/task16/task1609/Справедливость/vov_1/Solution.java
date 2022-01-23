package com.javarush.task.task16.task1609.Справедливость.vov_1;

/*
Справедливость
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("#1");
        alpha.join();
        Mouse mouse1 = new Mouse("#2");
        mouse1.join();
        Mouse mouse2 = new Mouse("#3");
    }

    private static void eat() {
        try {
            System.out.println("  eating...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " is starting to eat");
            eat();
            System.out.println(getName() + " has finished eating");
        }
    }
}
