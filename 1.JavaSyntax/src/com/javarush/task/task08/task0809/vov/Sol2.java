package com.javarush.task.task08.task0809.vov;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Sol2 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new HashMap<>()));

    }

    public static long getInsertTimeInMs(Map<String, Object> mapT) {
        Date start = new Date();
        insert10k(mapT);
        Date finish = new Date();
        return finish.getTime() - start.getTime();
    }

    public static void insert10k(Map<String, Object> mapT) {
        for (int i = 0; i < 100000; i++) {
            mapT.put("i", new Object());
        }
    }


}
