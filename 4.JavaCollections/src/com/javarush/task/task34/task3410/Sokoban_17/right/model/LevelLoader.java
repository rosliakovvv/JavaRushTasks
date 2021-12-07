package com.javarush.task.task34.task3410.Sokoban_17.right.model;

import com.javarush.task.task34.task3410.Sokoban_16.right.model.Box;
import com.javarush.task.task34.task3410.Sokoban_16.right.model.GameObjects;
import com.javarush.task.task34.task3410.Sokoban_16.right.model.Home;
import com.javarush.task.task34.task3410.Sokoban_16.right.model.Model;
import com.javarush.task.task34.task3410.Sokoban_16.right.model.Player;
import com.javarush.task.task34.task3410.Sokoban_16.right.model.Wall;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class LevelLoader {
    private Path levels;

    public LevelLoader(Path levels) {
        this.levels = levels;
    }

    public com.javarush.task.task34.task3410.Sokoban_16.right.model.GameObjects getLevel(int level) {
        Set<com.javarush.task.task34.task3410.Sokoban_16.right.model.Wall> walls = new HashSet<>();
        Set<com.javarush.task.task34.task3410.Sokoban_16.right.model.Box> boxes = new HashSet<>();
        Set<com.javarush.task.task34.task3410.Sokoban_16.right.model.Home> homes = new HashSet<>();
        com.javarush.task.task34.task3410.Sokoban_16.right.model.Player player = null;

        int loopLevel;
        if (level > 60) {
            loopLevel = level % 60;
        } else {
            loopLevel = level;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(levels.toFile()))) {
            int readLevel = 0;
            int x;
            int y = com.javarush.task.task34.task3410.Sokoban_16.right.model.Model.FIELD_CELL_SIZE / 2;
            boolean isLevelMap = false;

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Maze:")) {
                    readLevel = Integer.valueOf(line.split(" ")[1]);
                    continue;
                }
                if (readLevel == loopLevel) {
                    if (line.length() == 0) {
                        boolean isEnd = isLevelMap;

                        isLevelMap = !isLevelMap;

                        if (isEnd && !isLevelMap) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    if (isLevelMap) {
                        x = com.javarush.task.task34.task3410.Sokoban_16.right.model.Model.FIELD_CELL_SIZE / 2;

                        char[] chars = line.toCharArray();
                        for (char c : chars) {
                            switch (c) {
                                case 'X':
                                    walls.add(new Wall(x, y));
                                    break;
                                case '*':
                                    boxes.add(new com.javarush.task.task34.task3410.Sokoban_16.right.model.Box(x, y));
                                    break;
                                case '.':
                                    homes.add(new com.javarush.task.task34.task3410.Sokoban_16.right.model.Home(x, y));
                                    break;
                                case '&':
                                    boxes.add(new Box(x, y));
                                    homes.add(new Home(x, y));
                                    break;
                                case '@':
                                    player = new Player(x, y);
                            }
                            x += com.javarush.task.task34.task3410.Sokoban_16.right.model.Model.FIELD_CELL_SIZE;
                        }
                        y += Model.FIELD_CELL_SIZE;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new GameObjects(walls, boxes, homes, player);
    }
}
