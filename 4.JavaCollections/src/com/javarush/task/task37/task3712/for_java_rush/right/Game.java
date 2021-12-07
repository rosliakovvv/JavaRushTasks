package com.javarush.task.task37.task3712.for_java_rush.right;

public abstract class Game {
  public abstract void prepareForTheGame();

  public abstract void playGame();

  public abstract void congratulateWinner();

  public void run() {
    prepareForTheGame();
    playGame();
    congratulateWinner();
  }
}
