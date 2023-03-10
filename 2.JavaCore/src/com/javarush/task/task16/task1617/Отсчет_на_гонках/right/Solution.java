package com.javarush.task.task16.task1617.Отсчет_на_гонках.right;


/*
Отсчет на гонках
*/


public class Solution {
    public static volatile int numSeconds = 5;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (!isInterrupted()) {
                try {
                    System.out.print(numSeconds + " ");
                    Thread.sleep(1000);
                    numSeconds--;
                    if (numSeconds == 0) {
                        System.out.print("Марш!");
                        return;
                    }
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    return;
                }
            }
        }
        //add your code here - добавь код тут
    }
}

