package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Правило_треугольника {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.println("Существует");
        } else System.out.println("Не существует");
    }
}




