package com.javarush.task.task16.task1617.Отсчет_на_гонках.vov;

public class Solution {
    public static volatile int numSec = 5;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    System.out.print(numSec + " ");
                    numSec--;
                    Thread.sleep(1000);
                    if (numSec == 0) {
                        System.out.println("Go!");
                        return;
                    }
                } catch (InterruptedException e) {
                    System.out.print("It's fail");
                    return;
                }
            }
        }
    }
}
