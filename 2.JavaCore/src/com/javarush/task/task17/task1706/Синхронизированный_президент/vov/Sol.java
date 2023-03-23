package com.javarush.task.task17.task1706.Синхронизированный_президент.vov;

public class Sol {

    public static void main(String[] args) {

        OurPres expected = OurPres.getOurPres();
        OurPres other = OurPres.getOurPres();

        System.out.println(expected == other);
    }
}
