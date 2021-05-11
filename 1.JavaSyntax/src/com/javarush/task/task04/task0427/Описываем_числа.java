package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Описываем_числа {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isExit = false;
        int a = 0;

        System.out.println("Введи число от 1 до 999");
        while (!isExit) {
            int n = Integer.parseInt(reader.readLine());
            if (n >= 1 && n <= 999) {
                isExit = true;
                a = n;
            }
        }

        String s;
        String s1 = "однозначное";
        String s2 = "двухзначное";
        String s3 = "трехзначное";

        String c;
        String ch = "четное";
        String nech = "нечетное";


        if (a % 2 == 0) {
            c = ch;
        } else c = nech;

        if (a / 100 != 0) {
            s = s3;
        } else if (a / 10 != 0) {
            s = s2;
        } else s = s1;

        System.out.println(c + " " + s);

    }
}
