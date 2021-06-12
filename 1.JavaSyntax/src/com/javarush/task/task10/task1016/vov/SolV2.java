package com.javarush.task.task10.task1016.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SolV2 {
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

        for (String word : list) {
            int count = res.getOrDefault(word, 0);
            res.put(word, count + 1);
        }

        return res;
    }
}
