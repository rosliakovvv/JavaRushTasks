package com.javarush.task.task08.task0826.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        sortArr(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}

