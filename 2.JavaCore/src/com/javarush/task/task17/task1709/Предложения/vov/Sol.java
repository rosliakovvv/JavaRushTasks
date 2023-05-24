package com.javarush.task.task17.task1709.Предложения.vov;

public class Sol {

    public static volatile int proposal = 0;

    public static void main(String[] args) {

        // Сначала надо запустить нить-приемник
        new AcceptProposal().start();
        new MakeProposal().start();
    }

    public static class MakeProposal extends Thread {

        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                System.out.println("Make proposal #" + (thisProposal + 1));
                proposal = ++thisProposal;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public static class AcceptProposal extends Thread {

        @Override
        public void run() {
            int thisProposal = proposal;

            while (thisProposal < 10) {
                if (thisProposal != proposal) {
                    System.out.println("Accept proposal #" + proposal);
                    thisProposal = proposal;
                }
            }
        }
    }
}

