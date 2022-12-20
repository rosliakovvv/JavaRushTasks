package com.javarush.task.task16.task1611.Часы.vov;

/*
Часы
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock(); // Тут запускается нить Clock c приоритетом
        Thread.sleep(5000); // Главная нить засыпает,та часы тикают
        isStopped = true;
        System.out.println("The clock has to be stopped");
        Thread.sleep(5000); // Опять заспает, но часы уже не тикают (проверка)
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTikTak() throws InterruptedException {
            //add your code here - добавь код тут
            System.out.println("Tik");
            sleep(500);
            System.out.println("Tak");
            sleep(500);

        }
    }
}
