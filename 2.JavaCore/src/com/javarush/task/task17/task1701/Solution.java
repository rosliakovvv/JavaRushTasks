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
            // TODO: 30.01.2023 - Как тут может получиться null?
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

<<<<<<< HEAD

    public static class NoteThread extends Thread {
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
=======
    public static class NoteThread extends Thread {

        public void run() {
            try {
                for (int i = 0; i < 1000; i++) {
>>>>>>> ef01785f33e61b0df1fa3ed9181915247f433521
                    Note.addNote(getName() + "-Note" + i);
                    Thread.sleep(10);
                    Note.removeNote(getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
