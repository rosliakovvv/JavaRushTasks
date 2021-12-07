package com.javarush.task.task37.task3702.Фабрики_3.right;

import com.javarush.task.task37.task3702.Фабрики_3.right.male.MaleFactory;

public class Solution {
    public static void main(String[] args) {
        MaleFactory factory = new MaleFactory();
        System.out.println(factory.getPerson(99));
        System.out.println(factory.getPerson(4));
        System.out.println(factory.getPerson(15));
    }
}
