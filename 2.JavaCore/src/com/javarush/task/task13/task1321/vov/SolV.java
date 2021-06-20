package com.javarush.task.task13.task1321.vov;

public class SolV {
    public static void main(String[] args) {
        // так не вызывается toString
        System.out.println(new Hobby().INDEX);
        // а так вызывается
//        System.out.println(Dream.HOBBY);
        System.out.println(Dream.HOBBY.toString());
//        System.out.println(Hobby.INDEX);
    }

    interface Desire {
    }

    interface Dream {
        public final static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
