package com.javarush.task.task09.task0925.vov;

public class Sol {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Sol sol = new Sol();
        sol.A = 5;

        Sol.D = 5;
    }

    public int getA() {
        return A;
    }

}
