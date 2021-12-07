package com.javarush.task.task34.task3410.Sokoban_11.right.view;

import com.javarush.task.task34.task3410.Sokoban_11.right.controller.EventListener;
import com.javarush.task.task34.task3410.Sokoban_11.right.view.View;

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
