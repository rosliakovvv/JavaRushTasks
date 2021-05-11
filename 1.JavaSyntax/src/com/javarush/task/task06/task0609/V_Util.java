package com.javarush.task.task06.task0609;

public class V_Util {

    public static void main(String[] args) {

        System.out.println(getDistance(0, 5, 6, 2));
    }

    public static double getDistance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = x2 - x1;
        double a = dx * dx + dy * dy;
        return Math.sqrt(a);
    }
}
