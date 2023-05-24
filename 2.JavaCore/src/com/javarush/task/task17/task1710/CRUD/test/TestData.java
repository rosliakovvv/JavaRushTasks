package com.javarush.task.task17.task1710.CRUD.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestData {

    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        System.out.println(sdf.format(today));
    }

}
