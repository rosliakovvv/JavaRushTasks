package com.javarush.task.task16.task1608.Продвижение_на_политических_дебатах.vov2;

// 1 вар - расставить приоритеты
// 2 вар - ограничить время в конструкторе (так можно еще точнее контролировать количестве)

public class Sol2 {
    public static int totalSpeech = 200; // Количество выступлений
    public static int utterancesPerSpeech = 1000000; // Количество высказываний в выступлении
    public static boolean isSpeech = true;

    public static void main(String[] args) throws InterruptedException {
        Politican ivanova = new Politican("Иванова");
        Politican petrova = new Politican("Петрова");
        Politican sidorova = new Politican("Сидорова");

        while (petrova.getSpeechCount() + sidorova.getSpeechCount() + ivanova.getSpeechCount() < totalSpeech) {
        }
        isSpeech = false;

        System.out.println(ivanova);
        System.out.println(petrova);
        System.out.println(sidorova);

        Thread.sleep(1000);

        System.out.println("\n  проверка:");
        System.out.println(ivanova);
        System.out.println(petrova);
        System.out.println(sidorova);
    }

    private static class Politican extends Thread {
        private volatile int utteranceCount; // Количество высказываний

        public Politican(String name) throws InterruptedException {
            super(name);
            start();

            if (name.equals("Иванова")) {
//                setPriority(MAX_PRIORITY); // Первый менее точный вариант:
                join(500);
            }

            if (name.equals("Петрова")) {
                join(200);
            }

            if (name.equals("Сидорова")) {
                join(100);
            }
        }

        @Override
        public void run() {
            while (utteranceCount < totalSpeech * utterancesPerSpeech) {
                utteranceCount++;
                if (!isSpeech) return;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech; // Сколько было выступлений
        }

        @Override
        public String toString() {
            return String.format("%s напиздела %d раз", getName(), getSpeechCount());
        }
    }
}
