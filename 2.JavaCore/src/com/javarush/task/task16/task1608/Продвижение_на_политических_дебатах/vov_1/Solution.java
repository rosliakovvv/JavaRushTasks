package com.javarush.task.task16.task1608.Продвижение_на_политических_дебатах.vov_1;

/*
Продвижение на политических дебатах
*/

public class Solution {
    public static int totalSpeechCount = 200; // столько выступлений (подходов к микрофону)
    public static int utterancesPerSpeech = 1000000; // столько высказываний в одном выступлении

    public static void main(String[] args) throws InterruptedException {
        Politician ivanov = new Politician("Иванов");
//        ivanov.join();
        Politician petrov = new Politician("Петров");
        Politician sidorov = new Politician("Сидоров");

        while (ivanov.getSpeechCount() + petrov.getSpeechCount() + sidorov.getSpeechCount() < totalSpeechCount) {
        } // Этот цикл не дает завершиться главной нити (она ждет пока три дочерние нити базарят)

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);

        Thread.sleep(1000);


    }

    public static class Politician extends Thread {
        private volatile int utteranceCount; // счетчик высказываний

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech; // сколько у него было выступлений
        }

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getSpeechCount());
        }
    }
}

