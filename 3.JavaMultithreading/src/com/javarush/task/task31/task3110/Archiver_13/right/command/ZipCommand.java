package com.javarush.task.task31.task3110.Archiver_13.right.command;

import com.javarush.task.task31.task3110.Archiver_13.right.ConsoleHelper;
import com.javarush.task.task31.task3110.Archiver_13.right.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ZipCommand implements Command {

    public ZipFileManager getZipFileManager() throws Exception {
        ConsoleHelper.writeMessage("Введите полный путь файла архива:");
        Path zipPath = Paths.get(ConsoleHelper.readString());
        return new ZipFileManager(zipPath);
    }
}
