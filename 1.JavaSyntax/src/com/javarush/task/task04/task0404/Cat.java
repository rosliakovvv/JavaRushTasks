package com.javarush.task.task04.task0404;

/* 
Реализовать метод addNewCat
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        catsCount++;
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.addNewCat();
        System.out.println(catsCount);

        cat.addNewCat();
        System.out.println(catsCount);


    }
}
