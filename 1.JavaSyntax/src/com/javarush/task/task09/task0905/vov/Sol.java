package com.javarush.task.task09.task0905.vov;

public class Sol {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int length = stackTraceElements.length;
        System.out.println(length);
        return length;
    }

}
