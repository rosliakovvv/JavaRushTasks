package com.javarush.task.task12.task1204.vov;

public class SolV {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        System.out.println(o.toString());
    }

    public static class Cat {
        @Override
        public String toString() {
            return "кошка";
        }
    }

    public static class Dog {
        @Override
        public String toString() {
            return "собака";
        }
    }

    public static class Bird {
        @Override
        public String toString() {
            return "птица";
        }
    }

    public static class Lamp {
        @Override
        public String toString() {
            return "лампа";
        }
    }
}
