package com.javarush.task.task12.task1204.vov;

public class SolV2 {
    public static void main(String[] args) {
        printObjectType(new Scr.Cat());
        printObjectType(new Scr.Bird());
        printObjectType(new Scr.Lamp());
        printObjectType(new Scr.Cat());
        printObjectType(new Scr.Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        if (o instanceof Cat)
            System.out.println("Кошка");

        if (o instanceof Dog)
            System.out.println("Кошка");

        if (o instanceof Bird)
            System.out.println("Кошка");

        if (o instanceof Lamp)
            System.out.println("Кошка");


    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
