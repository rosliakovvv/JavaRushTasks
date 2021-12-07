package com.javarush.task.task35.task3501.for_java_rush.right;

public class GenericStatic {
    public static <T> T someStaticMethod(T genericObject) {
        System.out.println(genericObject);
        return genericObject;
    }
}
