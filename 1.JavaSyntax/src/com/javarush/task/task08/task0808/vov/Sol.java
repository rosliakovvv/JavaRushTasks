package com.javarush.task.task08.task0808.vov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sol {
    public static void main(String[] args) {
        List<String> listArr = new ArrayList<>();
        List<String> listLink = new LinkedList<>();

        insert10000(listArr);
        insert10000(listLink);

        get10000(listArr);
        get10000(listLink);

        set10000(listArr);
        set10000(listLink);

        remove10000(listArr);
        remove10000(listLink);
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add("element" + " i");
        }
    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        for (int i = 0; i < 10000; i++) {
        }
    }

    public static void remove10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
    }
}
