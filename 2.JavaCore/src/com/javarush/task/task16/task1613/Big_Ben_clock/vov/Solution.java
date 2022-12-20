package com.javarush.task.task16.task1613.Big_Ben_clock.vov;

public class Solution {

    // Вкл/выкл часов
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {

        Clock clock = new Clock("Лондон", 23, 59, 57);

        // Кол-во секунд, которые включаться часы
        Thread.sleep(8000);

        // Выкл. часы
        isStopped = true;

        // Просто пауза
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {

        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            seconds++;

            // Время нужное для прибавления 1 секунды
            Thread.sleep(1000);

            if (seconds == 60) {
                minutes++;
                seconds = 0;
            }
            if (minutes == 60) {
                hours++;
                minutes = 0;
            }
            if (hours == 24) hours = 0;

            //add your code here - добавь код тут
            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println("В Лондоне полночь!");
            } else
                System.out.println(String.format("%s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
        }
    }
}
