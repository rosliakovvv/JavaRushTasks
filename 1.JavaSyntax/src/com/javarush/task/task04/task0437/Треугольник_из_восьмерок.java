package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Треугольник_из_восьмерок {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.printf("8");
            }
            System.out.println();

        }
    }
}
