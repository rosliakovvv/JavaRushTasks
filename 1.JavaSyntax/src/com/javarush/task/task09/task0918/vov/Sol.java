package com.javarush.task.task09.task0918.vov;

/*
Все свои, даже исключения
*/

import java.io.IOException;
import java.net.SocketException;

public class Sol {
    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends SocketException {
    }

    static class MyException3 extends NumberFormatException{
    }

    static class MyException4 extends ArithmeticException{
    }
}
