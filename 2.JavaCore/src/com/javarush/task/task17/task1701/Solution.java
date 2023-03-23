package com.javarush.task.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Заметки
*/

public class Solution {

    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {

            // null будет если нить добавила, но другая сразу же удалила и первой удалять уже нечего
            // типа метод remove не полностью отработал и там временно null такое погринчное состоняние которое может
            // возникнуть и мы
            // его поймали
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

    public static class NoteThread extends Thread {

        public void run() {
            try {
                for (int i = 0; i < 10; i++) {

                    Note.addNote(getName() + " - Note #" + i);
                    Thread.sleep(10);
                    Note.removeNote(getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
