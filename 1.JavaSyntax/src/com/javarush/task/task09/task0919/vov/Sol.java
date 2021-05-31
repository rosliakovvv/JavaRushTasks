package com.javarush.task.task09.task0919.vov;

public class Sol {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void divideByZero() {
        System.out.println(5 / 0);
    }

}
