package com.javarush.task.task08.task0809.vov;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Sol3 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date dateS = new Date();
        insert100(list);
        Date dateF = new Date();

        long start = dateS.getTime();
        long finish = dateF.getTime();
        return start - finish;
    }

    private static void insert100(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(new Object());
        }
    }
}
