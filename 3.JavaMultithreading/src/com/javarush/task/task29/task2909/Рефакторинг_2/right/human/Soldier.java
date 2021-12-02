package com.javarush.task.task29.task2909.Рефакторинг_2.right.human;

import com.javarush.task.task29.task2909.Рефакторинг_3.right.human.Human;

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
