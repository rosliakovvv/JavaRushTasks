package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Гадание_на_долларовый_счет {
    public static void main(String[] args) {

        String s = "S";
        int i = 0;

        while (i < 10) {
            int j = 0;

            while (j < 10) {
                System.out.printf(s);
                j++;
            }
            System.out.println();
            i++;

        }

    }
}
