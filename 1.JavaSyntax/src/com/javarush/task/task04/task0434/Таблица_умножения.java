package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Таблица_умножения {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.printf(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
