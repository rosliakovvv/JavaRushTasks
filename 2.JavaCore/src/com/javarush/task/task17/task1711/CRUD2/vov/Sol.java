package com.javarush.task.task17.task1711.CRUD2.vov;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Sol {

    public static volatile List<Pers> peopleList = new ArrayList<>();

    static {
        peopleList.add(Pers.crMale("Ivane", new Date()));
        peopleList.add(Pers.crFemale("Vasia", new Date()));
    }

    public static SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {

        if (args[0] == null) {
            throw new RuntimeException();
        }

        switch (args[0]) {
            // c name1 sex1 bd1 name2 sex2 bd2 ...
            case "-c":
                synchronized (peopleList) {
                    for (int i = 1; i < args.length; i += 3) {
                        String name = args[i];
                        // Просот считали букву дял сравнения
                        String sexy = args[i + 1];
                        Date date = inputFormat.parse(args[i + 2]);
                        Pers pers = sexy.equals("м") ? Pers.crMale(name, date) : Pers.crFemale(name, date);
                        peopleList.add(pers);
                        System.out.println(peopleList.indexOf(pers));
                    }
                }
                break;

            // -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
            case "-u":

                synchronized (peopleList) {
                    for (int i = 1; i < args.length; i += 4) {
                        int id = Integer.parseInt(args[i]);
                        String name = args[i + 1];
                        String sex = args[i + 2];
                        Date date = inputFormat.parse(args[i + 3]);
                        Pers pers = peopleList.get(id);
                        pers.setName(name);
                        pers.setSex(sex.equals("м") ? Sexy.No : Sexy.Yes);
                        pers.setHbDay(date);
                        System.out.println(pers.getName());
                    }
                }
                break;

            // -d id1 id2 id3 id4 ...
            // Чтобы удалить надо почистить поля
            case "-d":

                synchronized (peopleList) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        peopleList.get(id).setName(null);
                        peopleList.get(id).setSex(null);
                        peopleList.get(id).setHbDay(null);
                    }
                }
                break;

            // -i id1 id2 id3 id4 ...
            //
            case "-i":
                synchronized (peopleList) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        Pers pers = peopleList.get(id);
                        System.out.println(pers.getName());
                        System.out.println(pers.getSex().equals(Sexy.No) ? "м" : "ж");
                        System.out.println(outputFormat.format(pers.getHbDay()));
                    }
                }
                break;
        }
    }
}
