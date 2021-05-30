package com.javarush.task.task09.task0917.vov;

/*
Перехват unchecked-исключений
*/

public class Sol {
    public static void main(String[] args) {
        handleExceptions(new Sol());
    }

    public static void handleExceptions(Sol obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RuntimeException e) { // в примере все исключения unchecked
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
