package com.javarush.task.task12.task1204.vov;

public class Sol {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if (o instanceof Cat)
            System.out.println("i am cat");
        if (o instanceof Dog)
            System.out.println("i am dog");
        if (o instanceof Bird)
            System.out.println("i am bird");
        if (o instanceof Lamp)
            System.out.println("i am lamp");

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
