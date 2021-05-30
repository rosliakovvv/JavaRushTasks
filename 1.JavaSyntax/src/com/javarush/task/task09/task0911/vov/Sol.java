package com.javarush.task.task09.task0911.vov;

import java.util.HashMap;

public class Sol {
    public static void main(String[] args) {

        /*
        Ошибка всплывает именно на моменте инициализации Карты (Map'a), остальные две строчки не запрещены логикой ХэшМэпа.
         */
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}
