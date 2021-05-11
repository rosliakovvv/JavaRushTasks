package com.javarush.task.task07.task0702.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] strArrTen = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strArrTen.length - 2; i++) {
            strArrTen[i] = reader.readLine();
        }

        for (int i = strArrTen.length-1; i >= 0; i--) {
            System.out.println(strArrTen[i]);
        }

    }
}
