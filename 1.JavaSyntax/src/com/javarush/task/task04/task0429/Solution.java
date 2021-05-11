package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countPlus = 0;
        int countMinus = 0;

        for (int i = 0; i < 3 ; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a > 0) countPlus++;
            if (a < 0) countMinus++;
        }

        System.out.println(countPlus);
        System.out.println(countMinus);

    }
}
