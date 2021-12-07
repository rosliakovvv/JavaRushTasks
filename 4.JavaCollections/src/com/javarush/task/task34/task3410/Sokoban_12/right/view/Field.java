package com.javarush.task.task34.task3410.Sokoban_12.right.view;

import com.javarush.task.task34.task3410.Sokoban_12.right.controller.EventListener;
import com.javarush.task.task34.task3410.Sokoban_12.right.model.GameObject;
import com.javarush.task.task34.task3410.Sokoban_12.right.view.View;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

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
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        Set<GameObject> gameObjects = view.getGameObjects().getAll();

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(g);
        }
    }
}
