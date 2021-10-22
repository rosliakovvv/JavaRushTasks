package com.javarush.task.task15.task1522.Закрепляем_паттерн_Singleton.right;

public class Moon implements Planet {
    private static volatile Moon instance = null;

    private Moon() {
    }

    public static Moon getInstance() {
        if (instance == null) {
            synchronized (Moon.class) {
                if (instance == null) {
                    instance = new Moon();
                }
            }
        }
        return instance;
    }
}
