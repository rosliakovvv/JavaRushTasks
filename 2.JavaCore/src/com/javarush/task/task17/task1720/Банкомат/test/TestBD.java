package com.javarush.task.task17.task1720.Банкомат.test;

import java.math.BigDecimal;

public class TestBD {

    public static void main(String[] args) {
        BigDecimal bd = BigDecimal.ZERO;
        BigDecimal a = new BigDecimal("100");

        System.out.println(bd.add(a));
    }

}
