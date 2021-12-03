package com.javarush.task.task30.task3002.Осваиваем_методы_класса_Integer.right;

/*
Осваиваем методы класса Integer
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertToDecimalSystem("0x16"));
        System.out.println(convertToDecimalSystem("012"));
        System.out.println(convertToDecimalSystem("0b10"));
        System.out.println(convertToDecimalSystem("62"));
    }

    public static String convertToDecimalSystem(String s) {
        if (s.startsWith("0")) {
            char[] chars = s.toCharArray();
            if (chars[1] == 'b') {
                s = s.substring(2);
                return "" + Integer.parseInt(s, 2);
            } else if (chars[1] == 'x') {
                s = s.substring(2);
                return "" + Integer.parseInt(s, 16);
            }
            return "" + Integer.parseInt(s, 8);
        } else {
            return s;
        }
    }
}
