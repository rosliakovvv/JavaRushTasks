package com.javarush.task.task06.task0607;

public class Cat2 {
    public static int catCount = 0;

    public Cat2() {
        catCount++;
    }

    public static void main(String[] args) {

        Cat2 cat = new Cat2();
        System.out.println(catCount);

    }
}
