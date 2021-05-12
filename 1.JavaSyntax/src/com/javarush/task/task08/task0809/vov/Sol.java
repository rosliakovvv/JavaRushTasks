package com.javarush.task.task08.task0809.vov;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Sol {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));

    }

    public static long getInsertTimeInMs(List list) {
        Date start = new Date();
        insert10(list);
        Date finish = new Date();
        return finish.getTime() - start.getTime();
    }

    public static void insert10(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());
        }
    }

}
