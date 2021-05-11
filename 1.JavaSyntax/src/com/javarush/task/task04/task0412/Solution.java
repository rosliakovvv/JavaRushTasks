package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        int a = Integer.parseInt(s);

//        System.out.println(a);

        if (a > 0) {
            a = a * 2;
        } else if (a < 0) {
            a++;
        }
        System.out.println(a);

    }
}