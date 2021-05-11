package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// ввод положительного

public class Сортировка {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n;

            while (true) {
                n = Integer.parseInt(reader.readLine());
                if (n <= 0) {
                    System.out.println("Fuck off");
                } else {
                    System.out.println("input " + n + " numbers please");
                    break;
                }
            }

            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(reader.readLine());
            }

            int max = num[0];
            for (int i = 1; i < n; i++) {
                if (num[i] > max) {
                    max = num[i];
                }
            }
            System.out.println(max);
        }



    }
}
