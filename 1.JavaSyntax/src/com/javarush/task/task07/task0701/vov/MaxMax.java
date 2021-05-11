package com.javarush.task.task07.task0701.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMax {
    public static void main(String[] args) throws IOException {
        System.out.println(max(initializeArray()));
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayTwenty = new int[20];
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + ":");
            arrayTwenty[i] = Integer.parseInt(reader.readLine());
        }
        return arrayTwenty;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
