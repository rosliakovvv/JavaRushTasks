package com.javarush.task.task17.task1701.Заметки.vov;

import java.util.ArrayList;
import java.util.List;

public class Sol1 {

    public static void main(String[] args) {
        new NoteThreadV1().start();
        new NoteThreadV1().start();
    }

    public static class NoteThreadV1 extends Thread {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                NoteV1.addNote(getName() + "-Note" + i);

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //ghhhgh
                //tot

                NoteV1.removeNote(getName());
            }
        }
    }

    public static class NoteV1 {

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            } else {
                System.out.println("Нить [" + threadName + "] удалила свою заметку [" + note + "]");
            }
        }
    }
}
