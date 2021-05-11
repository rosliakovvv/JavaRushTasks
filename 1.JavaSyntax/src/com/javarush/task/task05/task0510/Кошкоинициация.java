package com.javarush.task.task05.task0510;

public class Кошкоинициация {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 5;
        this.color = "black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "yellow";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "red";
    }

    public void initialize(int weight, String color, String address) {
        this.age = 6;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
