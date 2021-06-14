package com.javarush.task.task13.task1313.vov;

import java.awt.*;

public class SolV {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();


    }

    public static abstract class Fox implements Animal{
        public String getName() {
            return "Fox";
        }

        @Override
        public abstract Color getColor();

    }
}