package com.javarush.task.task15.task1507.ООП_Перегрузка.vov1;

public class Sol {

    public static void main(String[] args) {
        printMatrix(2,5,"-80");
    }

    public static void printMatrix(int a, int b, String val) {
        System.out.println("заполняем");
        printMatrix(a, b, (Object) val);
    }

    public static void printMatrix(int a, int b, Object val) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(val);
            }
            System.out.println();
        }
    }
}

