package com.javarush.task.task31.task3110.Archiver_18.right.command;

import com.javarush.task.task31.task3110.Archiver_18.right.ConsoleHelper;

public class ExitCommand implements Command {

    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
