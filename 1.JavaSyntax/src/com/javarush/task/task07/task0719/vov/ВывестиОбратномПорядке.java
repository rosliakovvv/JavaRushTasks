package com.javarush.task.task07.task0719.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ВывестиОбратномПорядке {
    public static void main(String[] args) throws IOException {

        List<Integer> listNum = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            listNum.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = listNum.size() - 1; i >= 0; i--) {
            System.out.println(listNum.get(i));
        }

//        for (Integer i: listNum
//             ) {
//            System.out.println(i);
//        }
    }
}
