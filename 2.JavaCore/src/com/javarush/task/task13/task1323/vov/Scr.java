package com.javarush.task.task13.task1323.vov;

public class Scr {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen {

    }
}
