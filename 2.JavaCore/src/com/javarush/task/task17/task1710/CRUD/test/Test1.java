package com.javarush.task.task17.task1710.CRUD.test;

public class Test1 {

    public static void main(String[] args) {

        if (args == null | args.length < 3) {
            System.out.println("nyam nyam hui");
            return;     // Иначе программа будет выполняться дальше
        }

        System.out.println(args[0] + " " + args[1]);    // test
    }
}

