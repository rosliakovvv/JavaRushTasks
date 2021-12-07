package com.javarush.task.task26.task2613.CashMachine_15.right.command;

import com.javarush.task.task26.task2613.exception.InterruptOperationException;

interface Command {
    void execute() throws InterruptOperationException, com.javarush.task.task26.task2613.CashMachine_11.right.exception.InterruptOperationException, com.javarush.task.task26.task2613.CashMachine_12.right.exception.InterruptOperationException;
}
