package com.javarush.task.task09.task0902.vov;

public class Sol2 {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    public static String method1() {
        System.out.println(method2());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        System.out.println(method3());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        System.out.println(method4());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        System.out.println(method5());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
