package com.javarush.task.task18.task1825.Собираем_файл.test;

public class TestCompare {

    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Hello world";
        String s3 = "Hello";

        int result1 = s1.compareTo(s3);
        int result2 = s1.compareTo(s2);
        int result3 = s3.compareTo(s2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
