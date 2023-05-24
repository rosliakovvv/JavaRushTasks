package com.javarush.task.task18.task1814.UnsupportedFileName.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol extends FileInputStream {

    public Sol(String name) throws IOException, UnsupFileEx {
        super(name);
        if (!name.endsWith(".txt")) {
            super.close();
            throw new UnsupFileEx();
        }
    }

    public static void main(String[] args) throws IOException, UnsupFileEx {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileEndName = reader.readLine();
        String fileName = "2.JavaCore/src/com/javarush/task/task18/task1814/UnsupportedFileName/vov/"+ fileEndName;

        Sol sol = new Sol(fileName);

        while (sol.available() > 0) {
            System.out.println(sol.read());
        }
    }
}
