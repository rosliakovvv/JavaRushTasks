package com.javarush.task.task17.task1707.МВФ.vov;

public class Sol {

    public static void main(String[] args) {
        IMF imf = IMF.getImf();
        IMF otherIMF = IMF.getImf();
        System.out.println(imf == otherIMF);
    }
}
