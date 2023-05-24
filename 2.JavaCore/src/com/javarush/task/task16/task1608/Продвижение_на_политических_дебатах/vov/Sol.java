package com.javarush.task.task16.task1608.Продвижение_на_политических_дебатах.vov;

// 1 вр - ivanova.join(); (заберет все голоса)
// 2 вр - setPriority(MAX_PRIORITY); (приоритеты в конструкторе, но нельзя точно контролировать политиков)
// 3 вр - (ограничить время в конструкторе по имени, так можно точно контролировать политиков)

public class Sol {

    // Каждый политик говорит по неколько речей (подходов)
    public static int totalSpeech = 200; // Общее кол-во всех речей
    public static int utterancesPerSpeech = 1000000; // Количество высказываний в одной речи
    public static boolean isSpeech;

    public static void main(String[] args) throws InterruptedException {

        // Запустили всех политиков одновременно (счетчик рабоает у всех)
        Politican ivanova = new Politican("Иванова");
        Politican petrova = new Politican("Петрова");
        Politican sidorova = new Politican("Сидорова");

        // Проверяем, чтобы они все вместе не превысили лимит всех речей
        while (petrova.getSpeechCount() + sidorova.getSpeechCount() + ivanova.getSpeechCount() < totalSpeech) {
        }

        // Остановим счетчик с помощью этой метки
        isSpeech = true;

        // Посмотрим результаты
        System.out.println("\n\tРезультаты дебатов:");
        System.out.println(ivanova);
        System.out.println(petrova);
        System.out.println(sidorova);

        Thread.sleep(1000);

        // Проверим остановлен ли счетчик
        System.out.println("\n\tПроверка (кол-во должно не измениться):");
        System.out.println(ivanova);
        System.out.println(petrova);
        System.out.println(sidorova);
    }

    private static class Politican extends Thread {

        // Это максимальное количество высказываний на дебатах
        // Теоритически file1.txt политик может использовать их все
        // Одна переменая для всех нитей (они не могут менять ее одновременно)
        private volatile int utteranceCount;


        public Politican(String name) throws InterruptedException {
            super(name);
            start();

            // Ограничим время выступления каждого политика (управляем количеством речей)
            if (name.equals("Иванова")) {
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
            // Это простой счестчик высказываений
            // По этому услови. политик может скачать максимум и забрать все время других участников
            // Поэтому будем останавим счетчик, когда лимит речей будет исчерпан
            while (utteranceCount < totalSpeech * utterancesPerSpeech) {
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
            return String.format("%s напиздела %d раз", getName(), getSpeechCount());
        }
    }
}
