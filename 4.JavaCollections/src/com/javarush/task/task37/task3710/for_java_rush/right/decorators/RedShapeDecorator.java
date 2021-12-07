package com.javarush.task.task37.task3710.for_java_rush.right.decorators;

import com.javarush.task.task37.task3710.for_java_rush.right.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        setBorderColor(decoratedShape);
        decoratedShape.draw();
    }

    private void setBorderColor(Shape decoratedShape) {
        System.out.println("Setting the border color for " + decoratedShape.getClass().getSimpleName() + " to red.");
    }
}
