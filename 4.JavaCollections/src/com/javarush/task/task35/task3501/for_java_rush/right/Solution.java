package com.javarush.task.task35.task3501.for_java_rush.right;

/*
Вызов статического метода
*/

public class Solution {
    public static void main(String[] args) {
        Number number = GenericStatic.<Number>someStaticMethod(new Integer(3));
    }
}
