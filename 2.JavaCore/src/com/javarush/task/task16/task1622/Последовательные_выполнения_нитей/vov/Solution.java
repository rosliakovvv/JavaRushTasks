package com.javarush.task.task16.task1622.Последовательные_выполнения_нитей.vov;

/*
Каждая нить выполняет file1.txt и тот же цикл, в котором выводит на экран свое имя и текущую итерацию цикла.
Без метода join нити будут работать хаотично. Если бы добавить метод, то они будут работать поочереди.
 */


public class Solution {
    // Количесво шагов в обратном отсчете:
    public static volatile int COUNT = 3;
    // Количество нитей:
    public static volatile int threadCount = 2;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < threadCount; i++) {
            new SleepingThread().join();
        }
    }

    public static class SleepingThread extends Thread {
        // Переменная для номера нити, в которой будет хранится текущее значение (присваеваем увеличивая)
        public static volatile int threadIndex = 0;
        // Переменная для обратного отсчета, в которой будет хранится текущее значение (присваеваем уменьшяая)
        public volatile int countdownIndex = COUNT;

        public SleepingThread() {
            // Присваиваем имя нити, на основе ее номера (увеличив, чтобы не с нуля)
            super(String.valueOf(++threadIndex + "-я нить"));
            start();
        }

        @Override
        public void run() {
            while (true) {
                System.out.println(this);
                // Инкремент выпониться ПОСЛЕ условия, даже если условие не выполниться
                if (--countdownIndex == 0) return;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }

        @Override
        public String toString() {
            return "#" + getName() + ":" + countdownIndex;
        }
    }
}

