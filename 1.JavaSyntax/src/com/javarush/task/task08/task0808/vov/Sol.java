package com.javarush.task.task08.task0808.vov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sol {
    public static void main(String[] args) {
        List arrL = new ArrayList();
        insert10(arrL);
        get10(arrL);
        set10(arrL);
        remove10(arrL);

        List linkL = new ArrayList();
        insert10(linkL);
        get10(linkL);
        set10(linkL);
        remove10(linkL);
    }

    public static void insert10(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }

    public static void get10(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(5000);
        }
    }

    public static void set10(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(5000, new Object());
        }
    }

    public static void remove10(List list) {
        for (int i = 0; i < 10000; i++) {
            if (list.isEmpty()) {
                return;
            }
            list.remove(0);
        }
    }

}

