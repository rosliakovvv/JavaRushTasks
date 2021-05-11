package com.javarush.task.task06.task0611;

public class V_StringBuilder {
    public static void main(String[] args) {
        String txt = "Amigo";
        int count;

        System.out.println(multiply("иди ", 4));
        System.out.println(multiply("в жопу "));
    }

    public static String multiply(String s, int count) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 1; i < count; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String multiply(String s) {
        return multiply(s, 5);
    }
}
