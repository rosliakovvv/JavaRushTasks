package com.javarush.task.task29.task2909.Рефакторинг_9.right.human;

public class Soldier extends Human {

    public Soldier(String name, int age) {
        super(name, age);
    }

    public void live() {
        fight();
    }

    public void fight() {
    }
}
