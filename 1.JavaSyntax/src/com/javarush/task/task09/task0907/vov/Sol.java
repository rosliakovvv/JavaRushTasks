package com.javarush.task.task09.task0907.vov;

public class Sol {
    public static void main(String[] args) {

        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println(e);

        }


    }
}