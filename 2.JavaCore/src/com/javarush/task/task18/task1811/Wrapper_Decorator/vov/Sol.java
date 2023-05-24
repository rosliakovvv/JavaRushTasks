package com.javarush.task.task18.task1811.Wrapper_Decorator.vov;

public class Sol {

    public static void main(String[] args) {

        Thread thread = new Thread(new DecoratorClass(new OriginalClass()));
        thread.start();

    }

    public static class OriginalClass implements Runnable {

        @Override
        public void run() {
            System.out.println("Действие ориганала");
        }
    }


    public static class DecoratorClass implements Runnable {

        Runnable dec;

        public DecoratorClass(Runnable r) {
            this.dec = r;
        }

        @Override
        public void run() {
            System.out.println("Действие обертки");
            dec.run();
        }
    }
}
