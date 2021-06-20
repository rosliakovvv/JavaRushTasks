package com.javarush.task.task13.task1318.vov;

import java.io.*;

public class SolV {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // либо пиши полный путь - либо перенеси файл в корень проекта
        String fileName = reader.readLine();


        InputStream inStream = new FileInputStream("D:\\pro_Java\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task13\\task1318\\vov\\" + fileName + ".txt");

        while (inStream.available() > 0) {
            int data = inStream.read();
            char ch = (char) data;
            System.out.print(ch);
        }

    }
}