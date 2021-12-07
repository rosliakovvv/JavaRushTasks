package com.javarush.task.task34.task3410.nast.controller;

import com.javarush.task.task34.task3410.nast.model.Direction;

public interface EventListener {
    void move(Direction direction);

    void restart();

    void startNextLevel();

    void levelCompleted(int level);
}
