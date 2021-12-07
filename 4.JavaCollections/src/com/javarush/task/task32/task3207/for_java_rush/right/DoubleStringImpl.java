package com.javarush.task.task32.task3207.for_java_rush.right;

import java.rmi.RemoteException;

public class DoubleStringImpl implements DoubleString {
    public String doubleString(String str) throws RemoteException {
        return str + str;
    }
}
