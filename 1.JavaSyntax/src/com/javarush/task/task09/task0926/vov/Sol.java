package com.javarush.task.task09.task0926.vov;

import java.util.ArrayList;

public class Sol {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> listT = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            //todo
        }
        return listT;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
