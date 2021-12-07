package com.javarush.task.task34.task3410.Sokoban_12.right.view;

import com.javarush.task.task34.task3410.Sokoban_12.right.controller.Controller;
import com.javarush.task.task34.task3410.Sokoban_12.right.controller.EventListener;
import com.javarush.task.task34.task3410.Sokoban_12.right.model.GameObjects;
import com.javarush.task.task34.task3410.Sokoban_12.right.view.Field;

import javax.swing.*;

public class View extends JFrame {
    private Controller controller;
    private Field field;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        field = new Field(this);
        add(field);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Сокобан");
        setVisible(true);
    }

    public void setEventListener(EventListener eventListener) {
        field.setEventListener(eventListener);
    }

    public void update() {
        field.repaint();
    }

    public GameObjects getGameObjects() {
        return controller.getGameObjects();
    }
}
