package com.javarush.task.task10.task1014.vov;

public class SolV {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        SolV solV = new SolV();
        solV.A = 5;
        solV.B = 5 * B;
        solV.C = 5 * C * D;
        solV.D = 5 * D * C;

        SolV.D = 5;
    }

    public int getA() {
        return A;
    }
}
