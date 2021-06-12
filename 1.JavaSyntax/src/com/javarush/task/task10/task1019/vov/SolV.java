package com.javarush.task.task10.task1019.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SolV {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        int id = 0;
        String name = null;

        while (true) {
            String str = reader.readLine();
            if (str.isEmpty()) {
                break;
            } else {
                id = Integer.parseInt(str);
                name = reader.readLine();
            }

            while (test(map, name)) {
                System.out.println("other");
                name = reader.readLine();
            }

            map.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " - " + pair.getKey());
        }
    }

    public static boolean test(HashMap<String, Integer> map, String s) {
        return map.containsKey(s);
    }
}

