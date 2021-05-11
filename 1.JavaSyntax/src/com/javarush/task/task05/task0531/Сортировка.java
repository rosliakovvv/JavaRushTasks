package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Сортировка {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[5];
        int n = 0;

        while (n < num.length) {
            num[n] = Integer.parseInt(reader.readLine());
            n++;
        }


        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println(min);
// Код ниже показывает что это не сортировка  а просто поиск минимального
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }
    }
}
