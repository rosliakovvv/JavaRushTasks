package com.javarush.task.task15.task1508.ООП_Перегрузка_убираем_лишнее.vov1;

public class Sol {
    public static void main(String[] args) {
        printTest(1L);
    }

    private static void printTest(int i) {
        System.out.println(" раз ");
    }

    private static void printTest(long i) {
        System.out.println(" file2.txt ");
    }


}
