package com.javarush.task.task16.task1608.Продвижение_на_политических_дебатах.vov2;

// вар1 - расставить приоритеты
// вар2 - ограничить время в конструкторе (так можно еще точнее контролировать количестве)
// надо остановить потоки

public class Sol {
    public static int totalSpeech = 200; // Количество выступлений
    public static int utterancesPerSpeech = 1000000; // Количество высказываний в выступлении

    public static void main(String[] args) throws InterruptedException {
        Politican ivanova = new Politican("Иванова");
//        ivanova.join(350); // Тут ограничиваем время чтобы остальные могли тоже говорить
//        ivanova.setPriority(Thread.MAX_PRIORITY);
        Politican petrova = new Politican("Петрова");
//        petrova.setPriority(6);
        Politican sidorova = new Politican("Сидорова");
//        sidorova.setPriority(4);

        while (petrova.getSpeechCount() + sidorova.getSpeechCount() + ivanova.getSpeechCount() < totalSpeech) {
        }

        // TODO: 23.01.2022 - Надо как то остановить потоки!

//        petrova.stop();
//        ivanova.stop();
//        sidorova.interrupt();

        System.out.println(ivanova);
        System.out.println(petrova);
        System.out.println(sidorova);

        Thread.sleep(1000);
        System.out.println();

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
