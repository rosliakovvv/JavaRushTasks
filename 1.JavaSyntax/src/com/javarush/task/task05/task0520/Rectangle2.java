package com.javarush.task.task05.task0520;

public class Rectangle2 {
    public int top;
    public int left;
    public int widht;
    public int height;

    public Rectangle2(int top, int left, int widht, int height) {
        this.top = top;
        this.left = left;
        this.widht = widht;
        this.height = height;
    }

    public Rectangle2(int top, int left) {
        this.top = top;
        this.left = left;
        this.widht = 0;
        this.height = 0;
    }

    public Rectangle2(int top, int left, int widht) {
        this.top = top;
        this.left = left;
        this.widht = widht;
        this.height = widht;
    }

    public Rectangle2(Rectangle2 rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.widht = rectangle.widht;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

        Rectangle2 rectangle1 = new Rectangle2(2,5,6,8);

        Rectangle2 rectangle2 = new Rectangle2(rectangle1);

        System.out.println(rectangle2.top);


    }
}
