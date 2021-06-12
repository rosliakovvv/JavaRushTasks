package com.javarush.task.task12.task1205.vov;

public class SolV {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        if (o instanceof Cow)
            System.out.println("i am cow");
        if (o instanceof Dog)
            System.out.println("i am dog");
        if (o instanceof Whale)
            System.out.println("i am while");
        if (o instanceof Pig)
            System.out.println("Неизвестное животое");
        return " ";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
