package com.javarush.task.task10.task1012.vov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SolV {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        int[] count = new int[alphabet.size()];

        for (String str : list) {
            char[] charStr = str.toCharArray();
            for (int i = 0; i < charStr.length; i++) {
                for (int j = 0; j < alphabet.size(); j++) {
                    if (alphabet.get(j).equals(charStr[i])) {
                        count[j]++;
                    }
                }
            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i).toString() + " - " + count[i]);
        }
    }
}