package com.javarush.task.task17.task1707.МВФ.vov;

public class IMF {

    private static IMF imf;

    private IMF() {
    }

    public static IMF getImf() {
        if (imf == null) {
            imf = new IMF();
        }
        return imf;
    }
}
