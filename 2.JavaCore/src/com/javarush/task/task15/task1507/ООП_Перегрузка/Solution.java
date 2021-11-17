package com.javarush.task.task15.task1507.ООП_Перегрузка;

/*
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(2, 3, 5);
        printMatrix(2, 3, 'h');
        printMatrix(2, 3, true);
    }

    public static void printMatrix(int m, int n, String value) {

        System.out.println("\nЗаполняем строки объектами String:");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Byte value) {

        System.out.println("\nЗаполняем строки объектами Byte:");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Short value) {

        System.out.println("\nЗаполняем строки объектами Short:");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Integer value) {

        System.out.println("\nЗаполняем строки объектами Integer:");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Long value) {

        System.out.println("\nЗаполняем строки объектами Long:");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Float value) {

        System.out.println("\nЗаполняем строки объектами Float:");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Double value) {

        System.out.println("\nЗаполняем строки объектами Double:");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Character value) {

        System.out.println("\nЗаполняем строки объектами Character:");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Boolean value) {

        System.out.println("\nЗаполняем строки объектами Boolean:");
        printMatrix(m, n, (Object) value);
    }





    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
