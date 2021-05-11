package com.javarush.task.task07.task0707.vov;

import java.util.ArrayList;
import java.util.List;

public class ЧеЗаСписок {
    public static void main(String[] args) {

        List<String> strArr = new ArrayList<>();
        strArr.add("hello");
        strArr.add("more");
        strArr.add("man");
        strArr.add("big");
        strArr.add("girl");


        System.out.println(strArr.size());

        for (String s: strArr
             ) {
            System.out.println(s);
        }
    }
}