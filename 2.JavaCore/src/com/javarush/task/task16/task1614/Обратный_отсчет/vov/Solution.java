package com.javarush.task.task16.task1614.Обратный_отсчет.vov;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static volatile List<String> list = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            list.add("Внимание! - " + i);
        }
    }

    public static void main(String[] args) {

        Thread t = new Thread(new Countdown(10), "Countdown");
        t.start();
    }


    public static class Countdown implements Runnable {

        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        @Override
        public void run() {
            while (countFrom > 0) {
                try {
                    printCountdown();
                } catch (InterruptedException e) {

                }
            }
        }

        private void printCountdown() throws InterruptedException {
            Thread.sleep(1000);
            // Уменьшение на 1 происходит ДО вызова
            countFrom--;
            System.out.println(list.get(countFrom));
        }
    }
}

