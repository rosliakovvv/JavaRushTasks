package com.javarush.task.task13.task1328.for_java_rush.right;

/*
Битва роботов
*/

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(Robot robotFirst, Robot robotScond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defensed = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s", robotFirst.getName(), robotScond.getName(), attacked, defensed));
    }
}

