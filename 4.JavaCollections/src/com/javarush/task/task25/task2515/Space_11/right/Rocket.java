package com.javarush.task.task25.task2515.Space_11.right;

public class Rocket extends BaseObject {

    public Rocket(double x, double y) {
        super(x, y, 1);
    }

    @Override
    public void move() {
        y--;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'R');
    }
}
