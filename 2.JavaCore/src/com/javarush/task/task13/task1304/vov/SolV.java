package com.javarush.task.task13.task1304.vov;

public class SolV {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public static class Screen implements Selectable, Updatable{

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
