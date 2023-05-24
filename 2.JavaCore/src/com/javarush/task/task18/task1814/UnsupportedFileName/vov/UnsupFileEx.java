package com.javarush.task.task18.task1814.UnsupportedFileName.vov;

public class UnsupFileEx extends Exception {

    public UnsupFileEx() {
        System.out.println("Files only .txt are supported");
    }
}
