package com.javarush.task.task35.task3510.for_java_rush.right;

public class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
}
