package com.javarush.task.task22.task2213.Тетрис_9.right;

public class Field {
    private int width;
    private int height;
    private int[][] matrix;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Field(int width, int height) {
        this.height = height;
        this.width = width;
        matrix = new int[height][width];
    }

    void print() {

    }

    void removeFullLines() {

    }

    Integer getValue(int x, int y) {
        return null;
    }

    void setValue(int x, int y, int value) {

    }
}
