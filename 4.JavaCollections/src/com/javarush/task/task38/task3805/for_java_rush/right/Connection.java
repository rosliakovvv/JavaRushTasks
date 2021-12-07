package com.javarush.task.task38.task3805.for_java_rush.right;

public interface Connection {
    void connect() throws WrongDataException, ConnectionException;

    void write(Object data) throws WrongDataException, ConnectionException;

    Object read() throws WrongDataException, ConnectionException;

    void disconnect() throws WrongDataException, ConnectionException;
}
