package com.javarush.task.task26.task2613.CashMachine_12.right.command;

import com.javarush.task.task26.task2613.CashMachine_11.right.Operation;
import com.javarush.task.task26.task2613.CashMachine_11.right.command.Command;
import com.javarush.task.task26.task2613.CashMachine_11.right.command.DepositCommand;
import com.javarush.task.task26.task2613.CashMachine_11.right.command.ExitCommand;
import com.javarush.task.task26.task2613.CashMachine_11.right.command.InfoCommand;
import com.javarush.task.task26.task2613.CashMachine_11.right.command.LoginCommand;
import com.javarush.task.task26.task2613.CashMachine_11.right.command.WithdrawCommand;
import com.javarush.task.task26.task2613.CashMachine_11.right.exception.InterruptOperationException;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private static final Map<Operation, com.javarush.task.task26.task2613.CashMachine_11.right.command.Command> allKnownCommandsMap = new HashMap<>();

    static {
        allKnownCommandsMap.put(Operation.LOGIN, new com.javarush.task.task26.task2613.CashMachine_11.right.command.LoginCommand());
        allKnownCommandsMap.put(Operation.DEPOSIT, new com.javarush.task.task26.task2613.CashMachine_11.right.command.DepositCommand());
        allKnownCommandsMap.put(Operation.WITHDRAW, new WithdrawCommand());
        allKnownCommandsMap.put(Operation.INFO, new com.javarush.task.task26.task2613.CashMachine_11.right.command.InfoCommand());
        allKnownCommandsMap.put(Operation.EXIT, new com.javarush.task.task26.task2613.CashMachine_11.right.command.ExitCommand());
    }

    private CommandExecutor() {
    }

    public static final void execute(Operation operation) throws InterruptOperationException {
        allKnownCommandsMap.get(operation).execute();
    }
}
