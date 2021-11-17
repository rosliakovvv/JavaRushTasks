package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];//"FileTest"
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            TreeSet<Character> treeSet = new TreeSet<>(/*new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {

                    return  Integer.compare(Character.getNumericValue(o1), Character.getNumericValue(o2)); //o1.compareTo(o2);
                }
            }*/);
           while (reader.ready()) {
               //reader.readLine();
               char[] chars = reader.readLine().toLowerCase().toCharArray();
               for (Character chr : chars
               ) {
                   if (Character.isAlphabetic(chr)) {
                       treeSet.add(chr);
                   }

               }
           }
           // treeSet.comparator();
            //Character.isLetter();
           // Collections.sort();
            Iterator<Character>iterator = treeSet.iterator();
            if (treeSet.size()<6)
                for (Character chr:treeSet
                     ) {

                    System.out.print(iterator.next());
                }

            else
                for (int i = 0; i <5; i++) {

                    System.out.print(iterator.next());
                }

        }
    }
}
