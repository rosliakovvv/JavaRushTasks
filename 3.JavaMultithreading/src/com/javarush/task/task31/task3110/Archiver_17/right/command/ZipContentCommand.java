package com.javarush.task.task31.task3110.Archiver_17.right.command;

import com.javarush.task.task31.task3110.Archiver_17.right.ConsoleHelper;
import com.javarush.task.task31.task3110.Archiver_17.right.FileProperties;
import com.javarush.task.task31.task3110.Archiver_17.right.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Просмотр содержимого архива.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Содержимое архива:");

        List<FileProperties> files = zipFileManager.getFilesList();
        for (FileProperties file : files) {
            ConsoleHelper.writeMessage(file.toString());
        }

        ConsoleHelper.writeMessage("Содержимое архива прочитано.");
    }
}
