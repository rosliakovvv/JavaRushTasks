package com.javarush.task.task29.task2909.Рефакторинг_10.right.human;

public class Professor extends Teacher {
    Professor(String name, int age, int numberOfStudents) {
        super(name, age, numberOfStudents);
    }

    public void live() {
        teach();
    }

}
