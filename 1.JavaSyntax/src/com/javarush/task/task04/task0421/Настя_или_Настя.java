package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Настя_или_Настя {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name_1 = reader.readLine();
        String name_2 = reader.readLine();

        if (name_1.equals(name_2)) {
            System.out.println("Имена равны");
        }
        if (name_1.length() == name_2.length()) {
            System.out.println("Длины имен равны");
        }

    }
}
