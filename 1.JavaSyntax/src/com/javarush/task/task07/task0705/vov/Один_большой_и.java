package com.javarush.task.task07.task0705.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Один_большой_и {
    public static void main(String[] args) throws IOException {
        int[] bigArr = new int[6];
        int[] smallArr1 = new int[4];
        int[] smallArr2 = new int[2];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = Integer.parseInt(reader.readLine());
        }


        // можно сделать это в одном цикле если массивы равны. а у меня могут быть и не равны

        for (int i = 0; i < smallArr1.length; i++) {
            smallArr1[i] = bigArr[i];
        }

        for (int i = 0; i < smallArr2.length ; i++) {
            smallArr2[i] = bigArr[smallArr1.length + i];
        }

        for (int i: smallArr2
             ) {
            System.out.println(i);
        }


    }
}
