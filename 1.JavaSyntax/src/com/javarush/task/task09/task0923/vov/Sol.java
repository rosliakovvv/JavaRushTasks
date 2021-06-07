package com.javarush.task.task09.task0923.vov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sol {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> vowel = new ArrayList<>();
        List<String> consonants = new ArrayList<>();


        String str = reader.readLine();
        String strWithOutSpace = str.replace(" ", "");
        char[] newStr = strWithOutSpace.toCharArray();
        for (char ch : newStr) {
            if (isVowel(ch)) {
                vowel.add(ch + " ");
            } else consonants.add(ch + " ");
        }

        for (String s : vowel) {
            System.out.print(s);
        }
        System.out.println();

        for (String s : consonants) {
            System.out.print(s);
        }
        System.out.println();


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}