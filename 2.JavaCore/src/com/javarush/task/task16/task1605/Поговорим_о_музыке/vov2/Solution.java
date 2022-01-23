package com.javarush.task.task16.task1605.Поговорим_о_музыке.vov2;

/*
Поговорим о музыке
*/

import java.util.Date;

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

    public static class Violin implements MusicalInstrument {

        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        @Override
        public Date startPlaying() {
            return new Date();
        }

        @Override
        public Date stopPlaying() {
            return new Date();
        }

        @Override
        public void run() {
            Date dateStart = startPlaying();
            sleepNSeconds(1);
            Date dateStop = startPlaying();

            System.out.println(owner + " playing " + (dateStop.getTime() - dateStart.getTime()) + " ms");

        }
    }
}
