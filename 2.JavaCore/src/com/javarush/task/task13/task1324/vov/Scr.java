package com.javarush.task.task13.task1324.vov;

import java.awt.*;

public class Scr {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {

        Color getColor();

        Integer getAge();
    }

    public static class Fox {
        public String getName() {
            return "Fox";
        }
    }
}
