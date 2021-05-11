package com.javarush.task.task05.task0523;

public class Circle3 {
    public Color color;

    public Circle3() {
        color = new Color();
    }

    public static void main(String[] args) {
        Circle3 circle = new Circle3();

        circle.color.setDes("Hui");

        System.out.println(circle.color.getDes());
    }

    public class Color {
        String des;

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }
    }
}
