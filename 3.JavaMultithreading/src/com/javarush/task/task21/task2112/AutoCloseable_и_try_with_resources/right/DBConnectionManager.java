package com.javarush.task.task21.task2112.AutoCloseable_и_try_with_resources.right;

public class DBConnectionManager {
    public FakeConnection getFakeConnection() {
        return new FakeConnection();
    }
}
