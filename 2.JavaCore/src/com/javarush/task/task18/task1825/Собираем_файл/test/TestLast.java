package com.javarush.task.task18.task1825.Собираем_файл.test;

public class TestLast {

    public static void main(String[] args) {

        String s = "Lost.part1";

        int i = s.lastIndexOf(".part");

        System.out.println(i);

        String newS = s.substring(0, i);

        System.out.println(newS);


    }

}
