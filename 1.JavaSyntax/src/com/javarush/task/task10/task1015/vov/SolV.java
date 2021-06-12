package com.javarush.task.task10.task1015.vov;

import java.util.ArrayList;

public class SolV {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    private static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayList = new ArrayList[3];

        arrayList[0] = new ArrayList<>();

        arrayList[0].add("idi na hui");
        arrayList[0].add("typid full");
        arrayList[0].add("fat pig");

        arrayList[1] = new ArrayList<>();

        arrayList[1].add("hello");
        arrayList[1].add("you look nice");
        arrayList[1].add("by");

        arrayList[2] = new ArrayList<>();

        arrayList[2].add("how do you do");
        arrayList[2].add("whats up");
        arrayList[2].add("good luck");

        return arrayList;
    }

    private static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
