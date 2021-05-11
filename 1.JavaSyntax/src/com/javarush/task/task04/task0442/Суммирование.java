package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Суммирование {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            int n = scanner.nextInt();
            count += n;

            if (n == -1) break;

        }

        System.out.println("Всего: " + count);

    }
}
