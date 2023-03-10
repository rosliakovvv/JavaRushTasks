package com.javarush.task.task22.task2202;

import java.util.ArrayList;
import java.util.List;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string == null || string.split(" ").length < 5) {
            throw new TooShortStringException();
        } else {
            int n = 5;
            for (int i = 1; i < n; i++) {
                stringBuilder.append(string.split(" ")[i]);
                if (i < n-1) stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
