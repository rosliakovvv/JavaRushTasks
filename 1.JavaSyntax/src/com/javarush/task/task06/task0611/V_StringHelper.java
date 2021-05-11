package com.javarush.task.task06.task0611;

public class V_StringHelper {

    public static String multiply(String s, int count) {
        String a = "";
        for (int i = 0; i < count; i++) {
            a += s;
        }
        return a;
    }

    public static String multiply(String s) {
        String a = "";
        for (int i = 0; i < 5; i++) {
            a += s;
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(multiply("привет "));
        System.out.println(multiply("fuck ", 6));
    }
}
