package com.javarush.task.task13.task1304.vov;

public class Sol {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    class Screen implements Selectable, Updatable {

        public void onSelect() {
        }

        public void refresh() {
        }
    }
}
