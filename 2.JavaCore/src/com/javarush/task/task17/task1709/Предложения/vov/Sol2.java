package com.javarush.task.task17.task1709.Предложения.vov;

public class Sol2 {

    public static volatile int prop = 0;

    public static void main(String[] args) {

        // Сначала запускаеи приемник
        new AcceprProp().start();
        new MakeProp().start();
    }

    public static class MakeProp extends Thread {

        @Override
        public void run() {

            int thisProp = prop;

            while (thisProp < 10) {
                System.out.println("Сделал предложение №" + (thisProp + 1));

                // Делаем следующие предложение (увеличиваем число предложений только здесь)
                prop = ++thisProp;

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public static class AcceprProp extends Thread {

        @Override
        public void run() {

            // Эта строчка отработает только file1.txt раз с 0
            int thisProp = prop;

            // Сравниваем по количеству предложений
            while (prop < 10) {
                if (thisProp != prop) {
                    System.out.println("Принял №" + prop);
                    thisProp = prop;
                }
            }
        }
    }
}

