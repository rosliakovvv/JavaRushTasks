package com.javarush.task.task17.task1710.CRUD.vov;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Sol {

    public static List<Per> people = new ArrayList<Per>();

    static {
        people.add(Per.createMale("Ivan", new Date()));
        people.add(Per.createFemale("Maria", new Date()));
    }

    static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws Exception {

        // Сначала проверим, есть ли аргументы.
        if (args[0] == null | args.length < 1) {
            throw new RuntimeException();
        }

        Date hbd;
        Per per;

        switch (args[0]) {
            // -c name sex bd
            case "-c":
                hbd = sdf1.parse(args[3]);

                if (args[2].equals("м")) {
                    per = Per.createMale(args[1], hbd);
                } else {
                    per = Per.createFemale(args[1], hbd);
                }

                people.add(per);

                // Показать id:
                System.out.println(people.size() - 1);

                // Проверка
                System.out.println(people.get(2).getName());
                break;

            // -r id
            case "-r":
                per = people.get(Integer.parseInt(args[1]));

                if (per != null) {
                    System.out.println(per.getName() + " " + (per.getSex() == Sexy.NO ? "м" : "ж") + " " + sdf2.format(per.getHb()));
                }
                break;

            // -u id name sex bd
            case "-u":
                // Надо считать дату потому что ее надо "переделать"
                hbd = sdf1.parse(args[4]);
                // Считать id чтобы знать ЧТО заменять
                int id = Integer.parseInt(args[1]);
                per = people.get(id);
                if (per == null) {
                    throw new IllegalArgumentException();
                }
                per.setSex(getSex(args[3]));
                per.setHb(hbd);
                per.setName(args[2]);
                people.add(id, per);

                // Test -u
                System.out.println(people.get(id).getName());
                break;

            // -d id
            case "-d":

                Per curPer = people.get(Integer.parseInt(args[1]));
                curPer.setHb(null);
                curPer.setSex(null);
                curPer.setName(null);

                // Test -d
                System.out.println(people.get(Integer.parseInt(args[1])).getName());
                break;
        }
    }

    public static Sexy getSex(String sexVar) {
        return sexVar.equals("м") ? Sexy.NO : Sexy.YES;
    }
}
