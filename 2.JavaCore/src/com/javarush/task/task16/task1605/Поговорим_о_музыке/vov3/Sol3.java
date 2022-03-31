package com.javarush.task.task16.task1605.Поговорим_о_музыке.vov3;

/*
Поговорим о музыке
*/

import java.util.Date;

public class Sol3 {
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

    public interface MusicalInstrument_v3 extends Runnable {
        Date startPlaying_v3();

        Date stopPlaying_v3();
    }

    public static class Violin implements MusicalInstrument_v3{
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying_v3() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying_v3() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }

        @Override
        public void run() {
            Date startTime = startPlaying_v3();
            sleepNSeconds(1);
            Date stopTime = stopPlaying_v3();
            System.out.println(stopTime.getTime() - startTime.getTime());

        }
    }
}

