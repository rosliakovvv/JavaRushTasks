package com.javarush.task.task17.task1722;

/* 
Посчитаем
*/


public class Solution {

    public static void main(String[] args) throws InterruptedException {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();

        // Если join вместе, то нити работают все одновременно и какая-нибудь может успеть сделать значение count 101
        // Если же join поставить после каждой то заполнение будет последовательным с заполнением до 104, т.к. кажда нить отработает по 1 разу.
        counter1.join();
        counter2.join();
        counter3.join();
        counter4.join();

        for (int i = 1; i <= 100; i++) {
            if (values[i] != 1) {
                System.out.println("Массив values содержит элементы неравные 1");
                break;
            }
        }

        System.out.println(values.length);

        for (int i : values) {
            System.out.println(i);
        }
    }

    public static Integer count = 0;
    public static int[] values = new int[105];

    static {
        for (int i = 0; i < 105; i++) {
            // Присваиваем всем элементам массива значение ноль, хотя они и так нули ! :) - можно закоментировать
            values[i] = 0;
        }
    }

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }



    public static class Counter extends Thread {

        @Override
        public void run() {
            // Увеличиваем все элементы массива на 1
            do {
                synchronized (Solution.class) {
                    incrementCount();
                    values[getCount()]++;
                    System.out.println(Thread.currentThread().getName() + " " + getCount());
                }

                // Сон перед проверкой позволяет другой нити уже изменить count, а текущая не будет делать новое изменение.
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
            }
            // Ограничиваем заполнение, оставляя место в массиве для следующих нитей
            while (getCount() < 100);
        }
    }
}
