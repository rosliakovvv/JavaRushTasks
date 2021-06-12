package com.javarush.task.task10.task1018.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Sol {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Sol() {
        this.map = new HashMap<>();
    }

    public static void main(String[] args) throws IOException {
        Sol Sol = new Sol();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            Sol.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : Sol.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
