package com.javarush.task.task05.task0513;

/*
Собираем прямоугольник
*/

public class Rectangle2 {
    int top;
    int left;
    int width;
    int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle2 rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

        Rectangle2 rectangle1 = new Rectangle2();
        rectangle1.initialize(50, 30, 20, 100);

        Rectangle2 rectangle2 = new Rectangle2();

        rectangle2.initialize(rectangle1);
    }
}
