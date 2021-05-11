package com.javarush.task.task07.task0714.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ОбратныйПорядок {
    public static void main(String[] args) throws IOException {
        List<String> sArr = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            sArr.add(reader.readLine());
        }

        sArr.remove(2);

        for (int i = sArr.size()-1; i >= 0 ; i--) {
            System.out.println(sArr.get(i));
        }

    }
}
