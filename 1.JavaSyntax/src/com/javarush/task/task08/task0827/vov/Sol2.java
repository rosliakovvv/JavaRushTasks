package com.javarush.task.task08.task0827.vov;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Sol2 {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOddNorm("Jan 2 2013"));
    }

    private static boolean isDateOddNorm(String date) throws ParseException {

        // тут надо распарсить дату и добавить ее в

        LocalDate today;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM d yyy", Locale.ENGLISH);
        today= LocalDate.parse(date, dtf);
        int count = today.getDayOfYear();

        return count % 2 != 0;
    }
}
