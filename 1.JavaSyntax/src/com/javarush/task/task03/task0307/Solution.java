package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg_1 = new Zerg();
        Zerg zerg_2 = new Zerg();
        Zerg zerg_3 = new Zerg();
        Zerg zerg_4 = new Zerg();
        Zerg zerg_5 = new Zerg();

        zerg_1.name = "Zerg_1";
        zerg_2.name = "Zerg_2";
        zerg_3.name = "Zerg_3";
        zerg_4.name = "Zerg_4";
        zerg_5.name = "Zerg_5";

        Protoss protoss_1 = new Protoss();
        Protoss protoss_2 = new Protoss();
        Protoss protoss_3 = new Protoss();

        protoss_1.name = "Protoss_1";
        protoss_2.name = "Protoss_2";
        protoss_3.name = "Protoss_3";

        Terran terran_1 = new Terran();
        Terran terran_2 = new Terran();
        Terran terran_3 = new Terran();
        Terran terran_4 = new Terran();

        terran_1.name = "Terran_1";
        terran_2.name = "Terran_2";
        terran_3.name = "Terran_3";
        terran_4.name = "Terran_4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
