package com.javarush.task.task08.task0807.vov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sol {
    //LinkedList и ArrayList

    public static void main(String[] args) {
        createArrayList();
        createLinkedList();


    }

    public static Object createArrayList() {
        List<String> list1 = new ArrayList<>();
        return list1;
    }

    public static Object createLinkedList() {
        List<String> list2 = new LinkedList<>();
        return list2;
    }
}
