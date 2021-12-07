package com.javarush.task.task34.task3410.Sokoban_10.right.model;

import com.javarush.task.task34.task3410.Sokoban_10.right.controller.EventListener;

public class Model {
    public static final int FIELD_CELL_SIZE = 20;

    private EventListener eventListener;

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}
