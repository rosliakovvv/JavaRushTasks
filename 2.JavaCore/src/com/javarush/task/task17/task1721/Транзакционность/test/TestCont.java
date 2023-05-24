package com.javarush.task.task17.task1721.Транзакционность.test;

import java.util.ArrayList;
import java.util.List;

public class TestCont {

    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        List<String> lines1 = new ArrayList<>();

        lines.add("Hello");
        lines.add("world");

        lines1.add("world");

        System.out.println(lines.containsAll(lines1));

        lines.removeAll(lines1);

        System.out.println(lines);
    }



}
