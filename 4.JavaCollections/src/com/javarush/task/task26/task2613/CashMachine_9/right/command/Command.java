package com.javarush.task.task26.task2613.CashMachine_9.right.command;

import com.javarush.task.task26.task2613.CashMachine_9.right.exception.InterruptOperationException;

interface Command {
    void execute() throws InterruptOperationException;
}
