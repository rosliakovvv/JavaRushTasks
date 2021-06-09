package com.javarush.task.task10.task1005.vov;

public class Src {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (byte) 300;
        short c = (byte) (b - a);
        System.out.println(c);
    }
}