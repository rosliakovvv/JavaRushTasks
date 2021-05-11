package com.javarush.task.task04.task0411;

/* 
Время года
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
        checkSeason(13);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        // Первый вариант
//        if (month>=1 & month<=2) {
//            System.out.println("Зима");
//        } else if (month>=3 & month<=5) {
//            System.out.println("Весна");
//        } else if (month>=6 & month<=8) {
//            System.out.println("Лето");
//        } else if (month>=9 & month <=11) {
//            System.out.println("Осень");
//        } else System.out.println("Зима");

        // Второй вариант
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет!");

        }


    }
}