package com.javarush.task.task16.task1605;

/* 
Поговорим о музыке
*/

import java.util.Date;

//это решение Н
public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument{
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }
        public void run(){
            Date startTime = startPlaying();
            sleepNSeconds(1);
            Date stopTime = stopPlaying();
            long time = stopTime.getTime() - startTime.getTime();
            System.out.println(String.format("Playing %s ms",time));
        }
    }
}
