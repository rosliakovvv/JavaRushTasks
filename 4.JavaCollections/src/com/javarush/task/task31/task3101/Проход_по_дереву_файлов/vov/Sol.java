package com.javarush.task.task31.task3101.Проход_по_дереву_файлов.vov;

import java.io.File;

public class Sol {

    public static void main(String[] args) {
        File path = new File(args[0]);
        File resultFileAbsolutePathV = new File(args[1]);

        System.out.println(path);
        System.out.println(resultFileAbsolutePathV);

    }

}
