package com.javarush.task.task05.task0522;

public class Circle2 {
    public double x;
    public double y;
    public double radius;

    public Circle2(double x) {
        this.x = x;
    }

    public Circle2(double x, double y) {
        this(x);
        this.y = y;
    }

    public Circle2(double x, double y, double radius) {
        this(x, y);
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}
