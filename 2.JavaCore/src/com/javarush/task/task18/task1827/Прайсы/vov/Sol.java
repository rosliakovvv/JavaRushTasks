package com.javarush.task.task18.task1827.Прайсы.vov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sol {

    public static class Prod {

        int id;
        String name;
        String price;
        String quantity;

        public Prod(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        String fullFileName = "2.JavaCore/src/com/javarush/task/task18/task1827/Прайсы/right/" + fileName + ".txt";

        List<Prod> prodList = new ArrayList<Prod>();

        try (BufferedReader fileRead = new BufferedReader(new FileReader(fullFileName))) {
            while (fileRead.ready()) {
                Prod prod = getRrod(fileRead.readLine());
                prodList.add(prod);
            }
        }

        switch (args[0]) {
            case "-c":
                int id = 0;
                for (Prod prod : prodList) {
                    if (prod.id > id) {
                        id = prod.id;
                    }
                }

                String name = "";
                // C помощью цикла отсекаем ненужные аргументы (имя может быть с пробелами)
                for (int i = 1; i < args.length - 2; i++) {
                    // Записываем имя в переменную.
                    name += args[i] + " ";
                }

                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }

                String price = args[args.length - 2];
                if (price.length() > 8) price.substring(0, 8);

                String quantity = args[args.length - 1];
                if (quantity.length() > 4) quantity.substring(0, 4);

                Prod prod = new Prod(++id, name.trim(), price, quantity);

                try (FileWriter fileWriter = new FileWriter(fullFileName, true)) {
                    fileWriter.write("\n");
                    fileWriter.write(prod.toString());
                }
        }
    }

    public static Prod getRrod(String str) {

        String id = str.substring(0, 8).trim();
        String name = str.substring(8, 38).trim();
        String price = str.substring(38, 46).trim();
        String quantity = str.substring(46, 50).trim();

        return new Prod(Integer.parseInt(id), name, price, quantity);
    }
}
