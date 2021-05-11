package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Vasia", 3, 5, 3);
        Cat cat2 = new Cat("Musia", 1, 3, 1);
        Cat cat3 = new Cat("Boris", 5, 7, 5);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }

    public static class Cat {
        String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int resAge = Integer.compare(this.age, anotherCat.age);
            int resWeight = Integer.compare(this.weight, anotherCat.weight);
            int resStrength = Integer.compare(this.strength, anotherCat.strength);
            int res = resAge + resWeight + resStrength;
            return res > 0;
        }
    }
}
