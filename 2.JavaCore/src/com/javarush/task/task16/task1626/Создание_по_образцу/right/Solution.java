package com.javarush.task.task16.task1626.Создание_по_образцу.right;

/*
Создание по образцу
*/


public class Solution {
    // Количество итераций
    public static int number = 5;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new CountdownRunnable(), "Уменьшаем:");
        t.start();
        t.join();
        new Thread(new CountUpRunnable(), "Увеличиваем:").start();
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexUp;

        public void run() {
            try {
                while (true) {
                    ++countIndexUp;
                    System.out.println(this);
                    Thread.sleep(500);
                    if (countIndexUp == Solution.number) return;
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
