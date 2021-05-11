package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Минимум_двух_чисел {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        // Первый вариант
//        if (a < b) {
//            System.out.println(a);
//        } else if (a > b) {
//            System.out.println(b);
//        } else System.out.println(a + " " + b);

        // Второй вариант

        System.out.println(a < b ? a : b);

    }
}