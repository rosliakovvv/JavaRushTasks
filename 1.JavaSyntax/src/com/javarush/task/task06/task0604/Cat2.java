package com.javarush.task.task06.task0604;

public class Cat2 {
    public static int catCount = 0;

    public Cat2() {
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        catCount--;
        super.finalize();
    }

    public static void main(String[] args) {


    }
}
