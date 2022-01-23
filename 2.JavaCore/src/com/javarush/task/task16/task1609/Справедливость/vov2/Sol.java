package com.javarush.task.task16.task1609.Справедливость.vov2;

public class Sol {
    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("alpha");
        alpha.join();
        Mouse beta = new Mouse("beta");
        beta.join();
        Mouse gamma = new Mouse("gamma");
    }

    public static void eat() throws InterruptedException {
        System.out.println("eating...");
        Thread.sleep(5000);
    }

    public static class Mouse extends Thread {

        public Mouse(String name) {
            super(name);
            start();
        }

        @Override
        public void run() {
            System.out.println(getName() + " start eating");
            try {
                eat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " stop eating");
        }

    }
}
