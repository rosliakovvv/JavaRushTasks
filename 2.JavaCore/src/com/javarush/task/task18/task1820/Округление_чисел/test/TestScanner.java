package com.javarush.task.task18.task1820.Округление_чисел.test;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double i = 0;

        while (scanner.hasNextDouble()) {
            i = scanner.nextDouble();
        }
        System.out.println(i);

    }
}
