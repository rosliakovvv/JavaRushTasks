package com.javarush.task.task15.task1508.ООП_Перегрузка_убираем_лишнее.task;

/*
ООП - Перегрузка - убираем лишнее
*/

public class Solution {
    public static void main(String[] args) {
        printT(1);
    }

    public static void print(byte b) {
        System.out.println("Я буду Java прогером!");
    }

    public static void print(double d) {
        System.out.println("Я буду Java прогером!");
    }

    public static void printT(long l) {
        System.out.println("Я буду Java прогером!");
    }

    public static void print(float f) {
        System.out.println("Я буду Java прогером!");
    }

    public static void print(char c) {
        System.out.println("Я буду Java прогером!");
    }
}
