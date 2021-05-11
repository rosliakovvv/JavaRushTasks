package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int[] length = new int[10];
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            list.add(string);
            length[i] = list.get(i).length();
        }
        Arrays.sort(length);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == length[0] || list.get(i).length() == length[9]) {
                System.out.println(list.get(i));
                break;
            }
        }


        ArrayList<String> copy = new ArrayList<>();
      /*  int maxLenght = list.get(0).length();
        int minLenght = list.get(0).length();


        for (int i = 0; i < list.size(); i++) {
            if (maxLenght<list.get(i).length()){

                maxLenght = list.get(i).length();
                copy.add(list.get(i));
            }
        }
        System.out.println(copy.toString());
        copy.add(list.get(0));
        for (int i = 0; i <list.size() ; i++) {
            if (minLenght>list.get(i).length()){
                copy.remove(1);
                minLenght = list.get(i).length();
                copy.add(list.get(i));
            }
        }

        System.out.println(copy.toString());
        for (String tex:list
             ) {
            if(tex.equals(copy.get(0))){
                System.out.println(tex);
            break;}
            if (tex.equals(copy.get(1))){
                System.out.println(tex);
            break;}
        }*/

/*        Comparator<String> comparator = new LengthComparator();
        Arrays.sort(list2, new LengthComparator());

        for (String text : list
                ) {
            if (text.equals(list2[0])) {
                System.out.println(text);
                break;
            } else if (text.equals(list2[9])) {
                System.out.println(text);
                break;
            }


        }*/
    }


    public static class LengthComparator implements java.util.Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}