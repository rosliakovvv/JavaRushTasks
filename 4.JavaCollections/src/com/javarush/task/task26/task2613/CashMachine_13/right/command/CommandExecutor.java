package com.javarush.task.task26.task2613.CashMachine_13.right.command;

/*
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
    private static final Map<Operation, Command> allKnownCommandsMap = new HashMap<>();

    static {
        allKnownCommandsMap.put(Operation.LOGIN, new LoginCommand());
        allKnownCommandsMap.put(Operation.DEPOSIT, new DepositCommand());
        allKnownCommandsMap.put(Operation.WITHDRAW, new WithdrawCommand());
        allKnownCommandsMap.put(Operation.INFO, new InfoCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
    }

    private CommandExecutor() {
    }

    public static final void execute(Operation operation) throws InterruptOperationException {
        allKnownCommandsMap.get(operation).execute();
    }
}
*/
