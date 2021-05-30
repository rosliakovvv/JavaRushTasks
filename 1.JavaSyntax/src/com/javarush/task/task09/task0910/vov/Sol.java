package com.javarush.task.task09.task0910.vov;

import java.util.ArrayList;

public class Sol {
    public static void main(String[] args) {

        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}