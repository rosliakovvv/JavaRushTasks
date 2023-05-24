package com.javarush.task.task17.task1710.CRUD.test;

public class TestPool {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "My";
        String str3 = "Dear";
        String str4 = "Friend".intern();
        String str5 = "Friend";

        System.out.println(str4 == str5);
    }
}
