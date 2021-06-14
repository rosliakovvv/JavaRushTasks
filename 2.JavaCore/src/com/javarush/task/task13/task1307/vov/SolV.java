package com.javarush.task.task13.task1307.vov;

public class SolV {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>{
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}