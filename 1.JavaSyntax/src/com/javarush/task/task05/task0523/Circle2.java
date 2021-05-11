package com.javarush.task.task05.task0523;

public class Circle2 {

    public Color color;

    public Circle2() {
        color = new Color();
    }

    public static class Color {
        String des;

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }
    }

    public static void main(String[] args) {

        Circle2 circle = new Circle2();

        circle.color.setDes("Red");

        System.out.println(circle.color.getDes());
    }
}