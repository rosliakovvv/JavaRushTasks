package com.javarush.task.task18.task1827.Прайсы.test;

public class TestStringFormat {

    public static void main(String[] args) {

        String s = String.format("a = %s, b = %d", "hello", 2);

        String s2 = String.format("%-5s%-10s%-3s", "hel", "world","bla");

        System.out.println(s2);

    }

}
