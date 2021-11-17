package com.javarush.task.task34.task3410.view;

import com.javarush.task.task34.task3410.controller.EventListener;
import com.javarush.task.task34.task3410.model.Direction;
import com.javarush.task.task34.task3410.model.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Field extends JPanel {
    private View view;
    private EventListener eventListener;

    public Field(View view) {
        this.view = view;

        addKeyListener(new KeyHandler());
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        Set<GameObject> gameObjects = view.getGameObjects().getAll();
        gameObjects.forEach(gameObject -> gameObject.draw(g));

    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

public class KeyHandler extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
        int i = e.getKeyCode();
        switch (i) {
            case KeyEvent.VK_LEFT: 
                eventListener.move(Direction.LEFT);
            case KeyEvent.VK_RIGHT:
                eventListener.move(Direction.RIGHT);
            case KeyEvent.VK_UP:
                eventListener.move(Direction.UP);
            case KeyEvent.VK_DOWN:
                eventListener.move(Direction.DOWN);
            case KeyEvent.VK_R:
                eventListener.restart();
        }
    }
}
}

