package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        int hourStart = 15 * 60;
        int hourNow = 15 * 60 + 30;
        int secondsAfter15 = (hourNow - hourStart) * 60;
        System.out.println(secondsAfter15);
    }
}