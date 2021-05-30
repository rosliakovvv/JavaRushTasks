package com.javarush.task.task09.task0916.vov;

import java.io.IOException;
import java.rmi.RemoteException;

public class Sol {
    public static void main(String[] args) {
        handleExceptions(new Sol());

    }

    public static void handleExceptions(Sol obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (IOException e) {
            System.out.println(e);
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
