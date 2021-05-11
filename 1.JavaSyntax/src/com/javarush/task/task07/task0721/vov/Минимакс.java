package com.javarush.task.task07.task0721.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Минимакс {
    public static void main(String[] args) throws IOException {
        int[] myArr = new int[4];

        getInts(myArr);

        int min = myArr[0];
        for (int i = 1; i < myArr.length; i++) {
            if (min > myArr[i]) {
                min = myArr[i];
            }
        }
        System.out.println(min);

        int max = myArr[0];
        for (int i = 1; i < myArr.length; i++) {
            if (max < myArr[i]) {
                max = myArr[i];
            }
        }
        System.out.println(max);

    }


    public static int[] getInts(int[] arr) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }
}
