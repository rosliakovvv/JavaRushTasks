package com.javarush.task.task09.task0926.vov;

import java.util.ArrayList;

public class Sol {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();

        int[] fiveNum = new int[]{2, 5, 6, 9, 7};
        int[] twoNum = new int[]{2, 5};
        int[] fourNum = new int[]{2, 5, 6, 9};
        int[] sevenNum = new int[]{2, 5, 6, 9, 7, 6, 5};
        int[] nullNum = new int[]{};

        list.add(fiveNum);
        list.add(twoNum);
        list.add(fourNum);
        list.add(sevenNum);
        list.add(nullNum);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
