package com.javarush.task.task35.task3510.for_java_rush.right;

public class Dog {

    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Пес " + name;
    }
}
