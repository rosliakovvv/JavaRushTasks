package com.javarush.task.task08.task0810.vov;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Sol {
    public static void main(String[] args) {
        List arrList = new ArrayList();
        List linkList = new LinkedList();
        fill(arrList);
        fill(linkList);
        System.out.println(getGetTimeInMs(arrList));
        System.out.println(getGetTimeInMs(linkList));
    }

    public static long getGetTimeInMs(List list) {
        Date start = new Date();
        get10k(list);
        Date finish = new Date();
        return finish.getTime() - start.getTime();

    }

    public static void fill(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());
        }
    }

    public static void get10k(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 100000; i++) {
            list.get(x);
        }
    }

}

