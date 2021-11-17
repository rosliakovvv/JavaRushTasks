package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = args[0];//"e:\9.txt"
        String fileName2 = args[1];//"e:\10.txt"

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
            StringBuffer outText = new StringBuffer("");
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                String[] words = line.split(" ");
                for (String word : words)
                    if (word.length() > 6)
                        outText.append(word).append(",");
            }
            outText.delete(outText.length() - 1, outText.length());
            fileWriter.write(outText.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
