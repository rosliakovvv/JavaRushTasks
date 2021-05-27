package com.javarush.task.task10.task1001.vov;

public class Sol {
    public static void main(String[] args) {
        int a = 0;
        int b = a + 46;
        byte c = (byte) (a * b);
        double f = 1234.15;
        long d = (long) (a + f / c + b);
        // на экран будет выведенное максимально значение типа long
        System.out.println(d);
    }

}

