package com.javarush.task.task17.task1706.Синхронизированный_президент.vov;

public class OurPres {

    public static OurPres pres;

    // Работает и без синхронизации

    static {
        pres = new OurPres();
    }

    private OurPres() {

    }

    public static OurPres getOurPres() {
        return pres;
    }
}
