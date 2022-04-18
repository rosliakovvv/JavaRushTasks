package com.javarush.task.task16.task1608.Продвижение_на_политических_дебатах.vov3;

public class Sol3 {

    // Политики по очереди подходят к микрофону и произносят речь.
    // Каждый политик говорит много речей (подходов).

    public static int totalSpeechCount = 250; // Общее количество речей на дебатах (всех политиков вместе).
    public static int utterancesPerSpeech = 1150000; // Количество высказываний в одной речи (подходе).

    public static void main(String[] args) throws InterruptedException {
        Politician_v3 putin_v3 = new Politician_v3("Putin");
        putin_v3.join();
        Politician_v3 baiden_v3 = new Politician_v3("Baiden");
        Politician_v3 navany_v3 = new Politician_v3("Navany");

        while (putin_v3.getSpeechCount() + baiden_v3.getSpeechCount() + navany_v3.getSpeechCount() < totalSpeechCount) {

        }

        System.out.println(putin_v3);
        System.out.println(baiden_v3);
        System.out.println(navany_v3);

        Thread.sleep(1000);

        System.out.println(putin_v3);
        System.out.println(baiden_v3);
        System.out.println(navany_v3);

    }

    public static class Politician_v3 extends Thread {
        private volatile int utteranceCount;
        // Общее количество высказываний политика во всех его речах (подходах).

        public Politician_v3(String name) {
            super(name);
            start();
        }

        @Override
        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        // Количество речей (подходов), которое сделал политик
        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getSpeechCount());
        }
    }
}
