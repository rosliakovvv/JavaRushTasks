package com.javarush.task.task13.task1301.vov;

public class SolV {
    public static void main(String[] args) throws Exception {
        BeerLover myFrend = new BeerLover();
        System.out.println(myFrend.isReadyToGoHome());
        System.out.println(myFrend.sleepOnTheFloor());
    }

    public interface Drinker {
        boolean READY_TO_GO_HOME = true;

        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        boolean sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {

        @Override
        public void askForMore(String message) {

        }

        @Override
        public void sayThankYou() {

        }

        @Override
        public boolean isReadyToGoHome() {
            return Drinker.READY_TO_GO_HOME;
        }

        @Override
        public boolean sleepOnTheFloor() {
            return Alcoholic.READY_TO_GO_HOME;
        }
    }
}
