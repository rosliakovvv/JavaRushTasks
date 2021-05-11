package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Хорошего_много_не_бывает {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int n = scanner.nextInt();

        while (n > 0) {
            System.out.println(s);
            n--;
        }

    }
}

