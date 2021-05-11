package com.javarush.task.task07.task0704.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Переверни_массив {
    public static void main(String[] args) throws IOException {
        int[] iTen = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < iTen.length; i++) {
            iTen[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = iTen.length - 1; i >= 0; i--) {
            System.out.println(iTen[i]);
        }


    }
}
