package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Сумма_цифр_трехзначного_числа {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int n1 = number / 100;
        int n2 = number % 100 / 10;
        int n3 = number % 10;

        return n1 + n2 + n3;

    }
}