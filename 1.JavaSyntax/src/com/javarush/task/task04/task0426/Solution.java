package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if (n > 0 && n % 2 == 0) {
            System.out.println("положительное четное");
        } else if (n > 0 && n % 2 != 0) {
            System.out.println("полоежительное нечетное");
        } else if (n < 0 && n % 2 == 0) {
            System.out.println("отрицательное четное");
        } else System.out.println("отричательное нечетное");

    }
}
