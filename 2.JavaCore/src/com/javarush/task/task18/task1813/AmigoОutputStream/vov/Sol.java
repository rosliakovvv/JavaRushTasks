package com.javarush.task.task18.task1813.AmigoОutputStream.vov;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sol extends FileOutputStream {

    // Можно вообще без расширения работать.
    // Если такого фала нет, то он появиться.
    public static String filename = "2.JavaCore/src/com/javarush/task/task18/task1813/AmigoОutputStream/vov/A.txt";

    private FileOutputStream fos;

    public Sol(FileOutputStream fos) throws FileNotFoundException {
        super(filename, true);
        this.fos = fos;
    }

    public static void main(String[] args) throws IOException {

        new Sol(new FileOutputStream(filename, true)).close();

    }

    @Override
    public void write(int b) throws IOException {
        super.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        super.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        super.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("Ползем очень уверенно!".getBytes());
        super.close();
    }

    @Override
    public void flush() throws IOException {
        super.flush();
    }
}
