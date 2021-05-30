package com.javarush.task.task09.task0908.vov;

public class Sol {
    public static void main(String[] args) {

        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}
