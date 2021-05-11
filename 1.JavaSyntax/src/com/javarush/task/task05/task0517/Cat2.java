package com.javarush.task.task05.task0517;

public class Cat2 {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat2(String name) {
        this.name = name;
        this.weight = 5;
        this.age = 3;
        this.color = "Black";
    }

    public Cat2(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Black";
    }

    public Cat2(String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "Black";
    }

    public Cat2(int weight, String color) {
        this.weight = weight;
        this.age = 0;
        this.color = color;
    }

    public Cat2(int weight, String color, String address) {
        this.weight = weight;
        this.age = 3;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
