package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat vasia = new Cat("Васька", 2, 5, 3);
        Cat musia = new Cat("Муська", 1, 3, 1);
        Cat boris = new Cat("Борис", 3, 7, 5);



    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }


    }
}