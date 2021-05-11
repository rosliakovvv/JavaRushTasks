package com.javarush.task.task07.task0716.vov;

import java.util.ArrayList;
import java.util.List;

public class СписокСловНорм {
    public static void main(String[] args) {
        List<String> wArr = new ArrayList<>();

        wArr.add("рита");
        wArr.add("лена");
        wArr.add("рая");
        wArr.add("лера");

        fix(wArr);

        for (String s : wArr
        ) {
            System.out.println(s);
        }
    }

    public static List<String> fix(List<String> list) {
        for (int i = 0; i < list.size(); i++) {

            String s = list.get(i); // обязательно нужна стобы во втором if было тоже самое

            if (s.contains("р") && !s.contains("л")) {
                list.remove(i);
                i--;
            }
            if (s.contains("л") && !s.contains("р")) {
                list.add(i, list.get(i));
                i++;
                // или так - сначала вычесления потом увеличения
                // list.add(i, list.get(i++));
            }
        }
        return list;
    }
}
