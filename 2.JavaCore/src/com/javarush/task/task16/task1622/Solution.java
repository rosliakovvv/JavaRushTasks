package com.javarush.task.task16.task1622;

/* 
Последовательные выполнения нитей
*/

public class Solution {
    // **Зачем тут делать одну переменную для разных задач и запутывать
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            // Метод join сделает так чтобы нити работали поочереди
            new SleepingThread().join();
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            // Просто присвоили имя для нити (сделали именем ее номер, переведя в строку)
            super(String.valueOf(++threadCount +" нить" ));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                // Вычитание выполнится даже если не выполнится проверка
                if (--countdownIndex == 0) return;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Нить прервана");
                }
                //напишите тут ваш код
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
