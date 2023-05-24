package com.javarush.task.task18.task1825.Собираем_файл.test;

public class TestSplit {

    public static void main(String[] args) {

        String s = "Lion.avi.part1";

        String[] sArr = s.split("part");

        for (String item : sArr) {
            System.out.println(item);
        }


    }

}
