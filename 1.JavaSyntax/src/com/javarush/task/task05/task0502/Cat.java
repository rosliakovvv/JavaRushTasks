package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        int resultAge = Integer.compare(this.age, anotherCat.age);
        int resultWeight = Integer.compare(this.weight, anotherCat.weight);
        int resultStrength = Integer.compare(this.strength, anotherCat.strength);

        int battle = resultAge + resultWeight + resultStrength;
        return battle > 0;

    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.age = 5;
        cat1.weight = 5;
        cat1.strength = 5;

        Cat cat2 = new Cat();
        cat2.age = 10;
        cat2.weight = 10;
        cat2.strength = 10;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}








