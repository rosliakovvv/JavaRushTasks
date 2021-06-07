package com.javarush.task.task08.task0829.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sol2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> familyAndCity = new HashMap<>();

        System.out.println("Put map");
        while (true) {
            String city = reader.readLine();

            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            familyAndCity.put(city, family);
        }

        System.out.println("Введите город");
        String city = reader.readLine();

        if (familyAndCity.containsKey(city)) {
            System.out.println(familyAndCity.get(city));
        }
    }
}
