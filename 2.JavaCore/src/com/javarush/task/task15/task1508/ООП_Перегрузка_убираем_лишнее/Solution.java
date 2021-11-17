package com.javarush.task.task15.task1508.ООП_Перегрузка_убираем_лишнее;

public class Solution {
    public static void main(String[] args) {
        printV1('a');
        printV1(1f);
    }

    private static void printV1(float v) {
        System.out.println(" я буду java программистом float ");
    }

    private static void printV1(char a) {
        System.out.println(" char ");
    }

        private static void printV1(int a) {
        System.out.println(" int ");
    }


}
