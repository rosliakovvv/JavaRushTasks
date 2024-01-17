package com.javarush.task.task34.task3410.Sokoban_17.right.controller;

import com.javarush.task.task34.task3410.Sokoban_17.right.model.Direction;

public interface EventListener {
    void move(Direction direction);

    void restart();

    void startNextLevel();

    void levelCompleted(int level);
}
