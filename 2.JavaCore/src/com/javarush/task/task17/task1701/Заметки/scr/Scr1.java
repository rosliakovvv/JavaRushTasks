package com.javarush.task.task17.task1701.Заметки.scr;

import java.util.ArrayList;
import java.util.List;

public class Scr1 {

    public static void main(String[] args) {
        NoteS1 ob1 = new NoteS1();
        ob1.addNotes("three");
        ob1.addNotes("two");
        ob1.addNotes("one");

        ob1.printNotes();
    }

    public static class NoteS1 {

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
