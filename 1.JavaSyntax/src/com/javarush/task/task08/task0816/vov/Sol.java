package com.javarush.task.task08.task0816.vov;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Sol {
    public static void main(String[] args) throws ParseException {
        Map<String, Date> vse = createMap();
        removeAllSummerPeople(vse);
        removeWithoutIter(vse);
        remoteWithoutIteratorAndData(vse);

        for (Map.Entry<String, Date> pair : vse.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Smirnov", dateFormat.parse("MAY 1 2012"));
        map.put("Petrov", dateFormat.parse("JUN 1 2012"));
        map.put("Kozlov", dateFormat.parse("JUL 1 2012"));
        map.put("Ivanov", dateFormat.parse("AUG 1 2012"));
        map.put("Klimova", dateFormat.parse("SEP 1 2012"));
        map.put("Durov", dateFormat.parse("OCT 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> entryIter = map.entrySet().iterator();
        while (entryIter.hasNext()) {
            Map.Entry<String, Date> pair = entryIter.next();
            if (pair.getValue().toString().contains("Sep")) {
                entryIter.remove();
            }
        }
    }

    public static void removeWithoutIter(Map<String, Date> mapT) {
        Map<String, Date> copyM = new HashMap<>(mapT);

        for (String key : copyM.keySet()) {
            Date date = copyM.get(key);
            int mount = date.getMonth() + 1; // месяцы считаются с нуля
            if (mount == 6 || mount == 7 || mount == 8) {
                mapT.remove(key);
            }
        }
    }

    public static void remoteWithoutIteratorAndData(Map<String, Date> mapT) {
        Map<String, Date> copyM = new HashMap<>(mapT);
        for (String key : copyM.keySet()) {
            String data = copyM.get(key).toString();
            if (data.contains("Oct")) {
                mapT.remove(key);
            }
        }
    }
}
