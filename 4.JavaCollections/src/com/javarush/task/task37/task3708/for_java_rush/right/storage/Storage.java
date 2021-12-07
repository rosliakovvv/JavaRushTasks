package com.javarush.task.task37.task3708.for_java_rush.right.storage;

public interface Storage {
    void add(Object storedObject);

    Object get(long id);
}
