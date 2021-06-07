package com.javarush.task.task09.task0922.vov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Sol {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String date = reader.readLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parseDate = simpleDateFormat.parse(date);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MMM dd YYYY", Locale.ENGLISH);
        String finishDate = simpleDateFormat1.format(parseDate);

        System.out.println(finishDate.toUpperCase());
    }
}
