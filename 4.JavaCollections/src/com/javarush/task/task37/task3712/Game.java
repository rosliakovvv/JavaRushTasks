package com.javarush.task.task37.task3712;                                                                                                    
                                                                                                    
public abstract class Game {                                                                                                    
  public abstract void congratulateWinner();                                                  
  public abstract void playGame();                                                  
  public abstract void prepareForTheGame();                                                  
                                                  
  public void run(){                                                  
    prepareForTheGame();
    playGame();
    congratulateWinner();                                                  
}                                                                                                  
}