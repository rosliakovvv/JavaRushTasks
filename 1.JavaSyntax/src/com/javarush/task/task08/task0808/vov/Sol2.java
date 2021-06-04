package com.javarush.task.task08.task0808.vov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sol2 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        insert100(arrayList);
        set100(arrayList);
        get100(arrayList);
        remove100(arrayList);

        List linkedList = new LinkedList();
        insert100(linkedList);
        set100(linkedList);
        get100(linkedList);
        remove100(linkedList);
    }

    public static void insert100(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i, new Object());
        }
    }

    public static void set100(List list) {
        for (int i = 0; i < 100000; i++) {
            list.set(5000, new Object()); // в середину
        }
    }

    public static void get100(List list) {
        for (int i = 0; i < 100000; i++) {
            list.get(5000); // из середины
        }
    }

    public static void remove100(List list) {
        for (int i = 0; i < 100000; i++) {
            if (list.isEmpty()) {
                return;
            }
            list.remove(0);
        }
    }
}
