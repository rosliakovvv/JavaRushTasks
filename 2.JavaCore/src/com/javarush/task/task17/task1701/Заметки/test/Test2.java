package com.javarush.task.task17.task1701.Заметки.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> notes = new ArrayList();
        notes.add("Привет");
        notes.add("Привет2");
        String strDelete = notes.remove(0);
        System.out.println(strDelete);
        String str2Delete = notes.remove(0);
        System.out.println(str2Delete);



    }
}
