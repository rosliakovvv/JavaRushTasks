package com.javarush.task.task31.task3110.Archiver_8.right.command;

import com.javarush.task.task31.task3110.Archiver_8.right.ConsoleHelper;

public class ExitCommand implements Command {

    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
