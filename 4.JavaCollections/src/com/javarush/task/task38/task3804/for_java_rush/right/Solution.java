package com.javarush.task.task38.task3804.for_java_rush.right;

/*
Фабрика исключений
*/

public class Solution {
    public static void main(String[] args) {
        ABCD_Factory.getException(ApplicationExceptionMessage.SOCKET_IS_CLOSED);
    }

    public static Class getFactoryClass() {
        return ABCD_Factory.class;
    }
}
