package com.javarush.task.task12.task1229.vov;

public class Sol {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static class Worker {
        public void workHard() {
        }
    }

    public interface Businessman {
        void workHard();
    }

    public static class CTO extends Worker implements Businessman {

    }
}
