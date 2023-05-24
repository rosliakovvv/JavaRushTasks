package com.javarush.task.task18.task1806.Исправить_ошибки.vov;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sol {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("2.JavaCore/src/com/javarush/task/task18/task1806/Исправить_ошибки/vov/src.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("2.JavaCore/src/com/javarush/task/task18/task1806/Исправить_ошибки/vov/res.txt");


        // одно условие, а не цикл, т.к. чтение происходит ха раз
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            // создали массив для этого "куска", узнав его примерный размер
            // Изменяя размер можем скопировать только чать файла, новая строка это 2 байта
            byte[] buffer = new byte[inputStream.available()];

            // вмето файла передаем буфер, т.к. в нем все поместится

            // вот тут происходит чтение и ЗАПИСЬ в буфер! а кол-во байтов записывается в переменную
            int count = inputStream.read(buffer);

            // а тут мы уже читаем из буфера ВСЕ байты
            outputStream.write(buffer, 0, count);

            // проверка
            for (byte b : buffer) {
                System.out.println(b + " ");
            }



        }

        inputStream.close();
        outputStream.close();
    }
}
