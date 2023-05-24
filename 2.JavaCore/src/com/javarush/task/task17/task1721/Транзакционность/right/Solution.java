package com.javarush.task.task17.task1721.Транзакционность.right;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/


public class Solution {

    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1;
        String fileName2;

        String end1;
        String end2;

        try {
            end1 = reader.readLine();
            end2 = reader.readLine();
            reader.close();

            fileName1 = "2.JavaCore/src/com/javarush/task/task17/task1721/Транзакционность/right/" + end1 + ".txt";
            fileName2 = "2.JavaCore/src/com/javarush/task/task17/task1721/Транзакционность/right/" + end2 + ".txt";

            BufferedReader fReader1 = new BufferedReader(new FileReader(fileName1));
            String input;
            while ((input = fReader1.readLine()) != null)
                // Запись в массив осуществлется посстрочно, т.е строка = элемент
                allLines.add(input);
            fReader1.close();

            BufferedReader fReader2 = new BufferedReader(new FileReader(fileName2));
            while ((input = fReader2.readLine()) != null)
                forRemoveLines.add(input);
            fReader2.close();

            for (String allLine : allLines) {
                System.out.println(allLine);
            }

            for (String removeLine : forRemoveLines) {
                System.out.println(removeLine);
            }

            new Solution().joinData();
        } catch (Exception ignore) {
        }

//        allLines.add("new");

        System.out.println(allLines);
        System.out.println(forRemoveLines);
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
