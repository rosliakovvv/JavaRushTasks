package com.javarush.task.task10.task1014.vov;

public class Sol {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Sol Sol = new Sol();
        Sol.A = 5;
        Sol.B = 5 * B;
        Sol.C = 5 * C * D;
        Sol.D = 5 * D * C;

        Sol.D = 5;
    }

    public int getA() {
        return A;
    }

}
