package com.javarush.task.task10.task1018.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SolV {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public SolV() {
        this.map = new HashMap<Integer, String>();
//        map.put(index, name);
    }

//    public SolV(HashMap<Integer, String> map) {
//        this.map = map;
//    }

    public static void main(String[] args) throws IOException {
        SolV solV = new SolV();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solV.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : solV.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
