package com.javarush.task.task10.task1020.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolV {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        sort(arr);

        System.out.println(arr[9]);
        System.out.println(arr[10]);
        System.out.println("hui");

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
