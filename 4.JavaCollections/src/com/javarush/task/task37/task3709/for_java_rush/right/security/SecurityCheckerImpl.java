package com.javarush.task.task37.task3709.for_java_rush.right.security;

public class SecurityCheckerImpl implements SecurityChecker {
    @Override
    public boolean performSecurityCheck() {
        System.out.println("SECURITY OK!");
        return true;
    }
}
