package com.javarush.task.task16.task1607.Horse_Racing.vov2;

public class Sol2 {

    public static void main(String[] args) {

    }

    class Horse extends Thread {
        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        @Override
        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) { // Задержка
                s += "" + i;
                // i am here

            }
        }
    }
}
