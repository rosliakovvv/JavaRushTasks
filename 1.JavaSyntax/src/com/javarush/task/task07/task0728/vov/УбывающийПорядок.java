package com.javarush.task.task07.task0728.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class УбывающийПорядок {

    public static int[] numArr = new int[6];
    private int i;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(reader.readLine());
        }

        sort(numArr);

        for (int i : numArr
        ) {
            System.out.println(i);
            ;
        }
    }

    public static void sort(int[] array) {
        int tmp;
        for (int i = 0; i < numArr.length - 1; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] < numArr[j]) {
                    tmp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tmp;
                }
            }
        }
    }
}
