package com.javarush.task.task07.task0712.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class СамыеСамые {
    public static void main(String[] args) throws IOException {

        List<String> sArr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            sArr.add(reader.readLine());
        }

        int maxL = sArr.get(0).length();
        for (int i = 1; i < sArr.size(); i++) {
            if (maxL < sArr.get(i).length()) {
                maxL = sArr.get(i).length();
            }
        }

        int minL = sArr.get(0).length();
        for (int i = 0; i < sArr.size(); i++) {
            if (minL > sArr.get(i).length()) {
                minL = sArr.get(i).length();
            }
        }

        for (int i = 0; i < sArr.size() ; i++) {
            if (sArr.get(i).length() == minL) {
                System.out.println(sArr.get(i) + " - короткая");
//                break;
            }
            if (sArr.get(i).length() == maxL) {
                System.out.println(sArr.get(i) + " - длиная");
//                break;
            }
        }


    }

}
