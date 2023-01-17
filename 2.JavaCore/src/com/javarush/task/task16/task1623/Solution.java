package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/


public class Solution {
    // Макс кол-во нитей
    static int count = 15;
    // Сколько нитей созданно (пока ноль - по умолчанию)
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        // Только одна нить будет созданна здесь
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        public void run() {
            if (createdThreadCount < Solution.count)
                System.out.println(new GenerateThread() + " in run");
        }

        @Override
        public String toString() {
            return getName() + " created";
        }
    }
}
