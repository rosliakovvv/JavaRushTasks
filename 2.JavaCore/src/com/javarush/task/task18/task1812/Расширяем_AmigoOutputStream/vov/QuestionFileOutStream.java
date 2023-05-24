package com.javarush.task.task18.task1812.Расширяем_AmigoOutputStream.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutStream implements AmigoOutStream {

    private AmigoOutStream amigo;

    public QuestionFileOutStream(AmigoOutStream amigo) {
        this.amigo = amigo;
    }

    @Override
    public void flush() throws IOException {
        amigo.flush();
    }

    @Override
    public void write(int i) throws IOException {
        amigo.write(i);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigo.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigo.write(b, off, len);
    }

    @Override
    public void close() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Закрыть поток?");
        switch (reader.readLine()) {
            case "да":
                amigo.close();
            case "нет":
                return;
        }
    }
}
