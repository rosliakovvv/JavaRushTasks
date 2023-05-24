package com.javarush.task.task17.task1722.Посчитаем.vov;

public class Sol {

    public static Integer count = 0;
    public static int[] valueV = new int[15];   // Все элементы равны нулю.

    public static void incCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {

        CounterV cv1 = new CounterV();
        CounterV cv2 = new CounterV();
        CounterV cv3 = new CounterV();
        CounterV cv4 = new CounterV();

        cv1.start();
        cv2.start();
        cv3.start();
        cv4.start();

        cv1.join();
        cv2.join();
        cv3.join();
        cv4.join();

        // Проверяем со второго элемента, т.к. первый равен 0
        for (int i = 1; i < 10; i++) {
            if (valueV[i] != 1) {
                System.out.println("Есть элемент не равный 1");
                break;
            }
        }

        for (int i : valueV) {
            System.out.println(i);
        }
    }

    public static class CounterV extends Thread {

        @Override
        public void run() {
            do {
                synchronized (Sol.class) {
                    incCount();
                    valueV[getCount()]++;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            while (getCount() < 10);
        }
    }
}

