package com.javarush.task.task17.task1722.Посчитаем.test;

public class TestInc {

    public static void main(String[] args) {
        int[] test = new int[10];

        for (int i = 0; i < 10; i++) {
            test[i] = 0;
        }

        for (int i : test) {
            System.out.println(i);
        }

        test[1]++;
        System.out.println(test[1]);
    }

}
