package com.javarush.task.task08.task0820.vov;

import java.util.HashSet;
import java.util.Set;

public class Sol {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        System.out.println("---");

        removeCats(pets, cats);
        printPets(pets);
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static Set<Cat> createCats() {
        Set<Cat> res = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            res.add(new Cat());
        }
        return res;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> res = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            res.add(new Dog());
        }
        return res;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> res = new HashSet<>();
        res.addAll(cats);
        res.addAll(dogs);
        return res;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
//        pets.removeAll(cats);

//        или циклом
        for (Cat cat : cats) {
            if (pets.contains(cat)) {
                pets.remove(cat);
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }
}
