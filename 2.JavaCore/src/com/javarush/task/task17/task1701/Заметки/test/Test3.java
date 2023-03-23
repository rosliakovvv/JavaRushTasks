package com.javarush.task.task17.task1701.Заметки.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        List<String> nodes = new ArrayList<>();

        nodes.add(null);

        String str = nodes.remove(0);

        if (str == null) {

            System.out.println("gdg");
        } else {
            System.out.println("dfgdfg");
        }
    }
}
