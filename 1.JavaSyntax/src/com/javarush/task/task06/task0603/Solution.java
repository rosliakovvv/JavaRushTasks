package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {



    public static void main(String[] args) {
        for (int i = 0; i < 500000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();

        }
    }
}

class Cat {
    public static int catCnt = 0;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        catCnt++;
        System.out.println("A Cat was destroyed " + catCnt);
    }
}

class Dog {
    public static int dogCnt = 0;
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        dogCnt++;
        System.out.println("A Dog was destroyed " + dogCnt);
    }
}
