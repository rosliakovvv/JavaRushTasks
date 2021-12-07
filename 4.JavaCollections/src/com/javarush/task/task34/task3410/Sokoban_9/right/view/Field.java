package com.javarush.task.task34.task3410.Sokoban_9.right.view;

import com.javarush.task.task34.task3410.Sokoban_9.right.controller.EventListener;

import javax.swing.*;
import java.awt.*;

public class Field extends JPanel {
    View view;
    private EventListener eventListener;

    public Field(View view) {
        this.view = view;
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    @Override
    public void paint(Graphics g) {
    }
}
