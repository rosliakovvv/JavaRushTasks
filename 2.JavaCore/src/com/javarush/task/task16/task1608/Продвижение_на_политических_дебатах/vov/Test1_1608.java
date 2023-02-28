package com.javarush.task.task16.task1608.Продвижение_на_политических_дебатах.vov;

public class Test1_1608 {

    // Каждый политик говрит несколько речей (подходов)
    public static int totalSpeechCount = 250;   // Общее кол-во всех речей
    public static int utterancesPerSpeech = 1150000; // Кол-во высказываний в одной речи
    public static boolean isSpeech;

    public static void main(String[] args) throws InterruptedException {

        // Запустили трех балаболов
        Politician putin = new Politician("Putin");
        Politician baiden = new Politician("Baiden");
        Politician navalny = new Politician("Navalny");

        // Проверяем, чтобы они не превысили все допустимое время
        while (putin.getSpeechCount() + baiden.getSpeechCount() + navalny.getSpeechCount() < totalSpeechCount) {
        }

        // Остановим счетчик с помощью этой метки
        isSpeech = true;

        // Посмотрим результаты
        System.out.println(putin);
        System.out.println(baiden);
        System.out.println(navalny);
    }

    public static class Politician extends Thread {

        // Это общее кол-во высказываний всех политиков
        private volatile int utteranceCount;

        public Politician(String name) throws InterruptedException {
            super(name);
            start();

            // Если дать свободно говрить, то кол-во речей превысет макс. доп. значение, поэтому:

            if (name.equals("Putin")) {
                join(500);
            }

            if (name.equals("Biden")) {
                join(200);
            }

            if (name.equals("Navalny")) {
                join(100);
            }
        }

        @Override
        public void run() {
            // Счетчик высказываний
            // По этому условию у политика есть возможность занять все время
            // Это зависит от того как мы буем упраялть нитями

            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
                if (isSpeech) return;
            }
        }

        // Кол-во речей, которое сделал политик
        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s told speech %d time", getName(), getSpeechCount());
        }
    }
}
