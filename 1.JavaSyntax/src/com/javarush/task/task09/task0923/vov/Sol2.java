package com.javarush.task.task09.task0923.vov;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol2 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();

        for (char ch : string.toCharArray()) {
            if (isVowel(ch)) {
                buffer1.append(ch).append(" ");
            } else if (ch != ' ') {
                buffer2.append(ch).append(" ");
            }
        }

        System.out.println(buffer1);
        System.out.println(buffer2);
    }

    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        for (char vowel : vowels) {
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
