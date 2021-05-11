package com.javarush.task.task07.task0716.vov;

import java.util.ArrayList;
import java.util.List;

public class СписокСлов {
    public static List<String> wArr;
    public static List<String> nArr;

    public static void main(String[] args) {
        wArr = new ArrayList<>();
        nArr = new ArrayList<>();

        wArr.add("роза");
        wArr.add("лира");
        wArr.add("лоза");
        wArr.add("куча");

        fix(wArr);

        for (String s : nArr
        ) {
            System.out.println(s);
        }
    }
    private static void fix(List<String> list) {

        for (String s: wArr
             ) {

            boolean isR = s.contains("р");
            boolean isL = s.contains("л");

            if (isR && !isL) {
                continue; // дальше не делаем ничего, продолдаем работу с новой итерацией цикла
            }

            if (!isR && isL) {
                nArr.add(s);
            }

            nArr.add(s);    // сюда также подходят слова которые содержат и обе буквы
        }


    }
}

