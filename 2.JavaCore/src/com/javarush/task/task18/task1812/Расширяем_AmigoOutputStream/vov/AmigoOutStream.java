package com.javarush.task.task18.task1812.Расширяем_AmigoOutputStream.vov;

import java.io.IOException;

public interface AmigoOutStream {

    void flush() throws IOException;

    void write(int i) throws IOException;

    void write(byte[] b) throws IOException;

    void write(byte[] b, int off, int len) throws IOException;

    void close() throws IOException;
}
