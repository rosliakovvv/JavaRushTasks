package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution2 {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();

        System.out.println(formatter.format(date));
    }
}
