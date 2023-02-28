package com.javarush.task.task17.task1701.Заметки.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        NoteObj no = new NoteObj();
        // Добавляем в нормальном порядке, а получим в обратном.
        no.addNotes("one");
        no.addNotes("two");
        no.addNotes("three");
        no.printNotes();
    }

    public static class NoteObj {
        public static List<String> notes = new ArrayList<>();

        public void addNotes(String note) {
            notes.add(0, note);
        }

        public static void printNotes() {
            for (String note : notes) {
                System.out.println(note);
            }
        }
    }
}
