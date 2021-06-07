package com.javarush.task.task08.task0830.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readLine();
        }

        sortWord(arr);

        for (String word : arr) {
            System.out.println(word);
        }

    }

    private static void sortWord(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (!isGreaterThen(arr[i], arr[j])) {
                    String tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }


    }

    // true, если строки в алф пор - можно знак поменять
    public static boolean isGreaterThen(String a, String b) {
        return a.compareTo(b) < 0;
    }

}
