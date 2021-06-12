package com.javarush.task.task10.task1016.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SolV3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayWords = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            arrayWords.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(arrayWords);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    private static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> res = new HashMap<>();



        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    res.put(list.get(i), count); // перезаписывает, если значения повторяются !
                }
            }
        }
        return res;
    }
}
