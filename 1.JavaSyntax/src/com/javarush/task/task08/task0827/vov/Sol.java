package com.javarush.task.task08.task0827.vov;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Sol {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOddV("Jan 13 2013")); // просто принято писать большими буквами
    }

    private static boolean isDateOddV(String date) throws ParseException {

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Date parseDate = simpleDateFormat1.parse(date);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("D"); // день в году
        String dateStr = simpleDateFormat2.format(parseDate);

        int dateInt = Integer.parseInt(dateStr);

        return dateInt % 2 != 0;
    }
}
