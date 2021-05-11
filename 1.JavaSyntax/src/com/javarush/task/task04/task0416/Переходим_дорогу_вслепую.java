package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Переходим_дорогу_вслепую {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        double c = t % 5;

//        System.out.println(c);

        if (c >= 0 && c < 3) {
            System.out.println("Зеленый");
        } else if (c >= 3 && c < 4) {
            System.out.println("Желтый");
        } else System.out.println("Красный");

    }
}