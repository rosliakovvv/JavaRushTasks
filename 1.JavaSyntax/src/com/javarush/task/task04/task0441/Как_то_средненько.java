package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.util.Scanner;

public class Как_то_средненько {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1 >= n2 && n1 <= n3 || n1 >= n3 && n1 <= n2) {
            System.out.println(n1);
        } else if (n2 >= n1 && n2 <= n3 || n2 >= n3 && n2 <= n1) {
            System.out.println(n2);
        } else System.out.println(n3);    }

}
