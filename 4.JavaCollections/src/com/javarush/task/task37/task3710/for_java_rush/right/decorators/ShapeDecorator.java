package com.javarush.task.task37.task3710.for_java_rush.right.decorators;

import com.javarush.task.task37.task3710.for_java_rush.right.shapes.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
