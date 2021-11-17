package com.javarush.task.task19.task1904.И_еще_один_адаптер.right;

import java.io.IOException;

public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}
