package com.javarush.task.task16.task1611.Часы.vov2;

public class Sol {
    public static volatile boolean isStoped = false;
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(5000);
        isStoped = true;
        System.out.println("часы остановлены");
        Thread.sleep(5000);
        System.out.println("проверка");

    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        @Override
        public void run() {
            while (!isStoped) {
                try {
                    printTikTak();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void printTikTak() throws InterruptedException {
            System.out.println("Tik blia");
            Thread.sleep(500);
            System.out.println("Tak blia");
            Thread.sleep(500);
        }
    }
}
