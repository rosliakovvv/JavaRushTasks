package com.javarush.task.task08.task0810.vov;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Sol2 {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        Date start = new Date();
        get10(list);
        Date finish = new Date();

        return finish.getTime() - start.getTime();
    }

    public static void get10(List list) {
        if (list.isEmpty()) {
            return;
        }

        for (int i = 0; i < 10000; i++) {
            list.get(list.size() / 2);
        }
    }
}

