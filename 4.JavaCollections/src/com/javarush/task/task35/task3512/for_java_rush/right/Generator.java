package com.javarush.task.task35.task3512.for_java_rush.right;

public class Generator<T> {

    private Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    T newInstance() throws IllegalAccessException, InstantiationException {
        return aClass.newInstance();
    }
}
