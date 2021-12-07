package com.javarush.task.task34.task3410.Sokoban_17.right.model;

import com.javarush.task.task34.task3410.Sokoban_16.right.model.Box;
import com.javarush.task.task34.task3410.Sokoban_16.right.model.GameObject;
import com.javarush.task.task34.task3410.Sokoban_16.right.model.Home;
import com.javarush.task.task34.task3410.Sokoban_16.right.model.Player;
import com.javarush.task.task34.task3410.Sokoban_16.right.model.Wall;

import java.util.HashSet;
import java.util.Set;

public class GameObjects {
    private Set<com.javarush.task.task34.task3410.Sokoban_16.right.model.Wall> walls;
    private Set<com.javarush.task.task34.task3410.Sokoban_16.right.model.Box> boxes;
    private Set<com.javarush.task.task34.task3410.Sokoban_16.right.model.Home> homes;
    private com.javarush.task.task34.task3410.Sokoban_16.right.model.Player player;

    public GameObjects(Set<com.javarush.task.task34.task3410.Sokoban_16.right.model.Wall> walls, Set<com.javarush.task.task34.task3410.Sokoban_16.right.model.Box> boxes, Set<com.javarush.task.task34.task3410.Sokoban_16.right.model.Home> homes, com.javarush.task.task34.task3410.Sokoban_16.right.model.Player player) {
        this.walls = walls;
        this.boxes = boxes;
        this.homes = homes;
        this.player = player;
    }

    public Set<Wall> getWalls() {
        return walls;
    }

    public Set<Box> getBoxes() {
        return boxes;
    }

    public Set<Home> getHomes() {
        return homes;
    }

    public Player getPlayer() {
        return player;
    }

    public Set<com.javarush.task.task34.task3410.Sokoban_16.right.model.GameObject> getAll() {
        Set<GameObject> gameObjects = new HashSet<>();
        gameObjects.addAll(walls);
        gameObjects.addAll(homes);
        gameObjects.addAll(boxes);
        gameObjects.add(player);
        return gameObjects;
    }
}
