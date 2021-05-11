package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.util.Scanner;

public class Как_назвали_так_назвали {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int day = scanner.nextInt();
        int mouth = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.println("Меня зовут " + name
                + ". Я родился " + day + "." + mouth + "." + year + ".");

    }
}
