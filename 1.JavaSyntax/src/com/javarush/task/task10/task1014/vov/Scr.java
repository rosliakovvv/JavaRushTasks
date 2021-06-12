package com.javarush.task.task10.task1014.vov;

public class Scr {
    public int A = 5;
    public int B = 5;
    public int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Scr Scr = new Scr();
        Scr.A = 5;

// не компилируются
//        Scr.B = 5 * B;
//        Scr.C = 5 * C * D;
//        Scr.D = 5 * D * C;

        Scr.D = 5;
    }

    public int getA() {
        return A;
    }

}
