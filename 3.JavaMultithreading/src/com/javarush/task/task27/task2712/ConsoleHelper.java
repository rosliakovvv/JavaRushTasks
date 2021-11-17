package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.09.2020.
 */
public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static String readString() throws IOException {
        String text = reader.readLine();
        return text;
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishList = new ArrayList<>();
        writeMessage(Dish.allDishesToString());
        writeMessage("Введите список блюд, 'exit' - завершение заказа.");
        String result = null;
        while (true){
            boolean a = false;
            result = reader.readLine();
            if(result.equals("exit"))break;

            for (Dish dish: Dish.values()){
                if (result.equals(dish.toString())) {
                    dishList.add(dish);
                    a = true;
                }
            }
            if(!a)writeMessage("Вы ввели не правильное блюдо!");

        }
        return dishList;
    }
}
