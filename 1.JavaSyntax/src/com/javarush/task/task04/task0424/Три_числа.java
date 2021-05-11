package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Три_числа {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n_1 = Integer.parseInt(reader.readLine());
        int n_2 = Integer.parseInt(reader.readLine());
        int n_3 = Integer.parseInt(reader.readLine());

        if (n_1 != n_2 && n_2 == n_3)  {
            System.out.println("1");
        } if (n_2 != n_3 && n_3 == n_1) {
            System.out.println("2");
        } if (n_3 != n_1 && n_1 == n_2) {
            System.out.println("3");
        }

    }
}
