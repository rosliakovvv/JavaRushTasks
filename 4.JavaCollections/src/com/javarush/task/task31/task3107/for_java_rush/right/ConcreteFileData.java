package com.javarush.task.task31.task3107.for_java_rush.right;

public class ConcreteFileData implements FileData {

    private boolean hidden;
    private boolean executable;
    private boolean directory;
    private boolean writable;

    public ConcreteFileData(boolean hidden, boolean executable, boolean directory, boolean writable) {
        this.hidden = hidden;
        this.executable = executable;
        this.directory = directory;
        this.writable = writable;
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }

    @Override
    public boolean isExecutable() {
        return executable;
    }

    @Override
    public boolean isDirectory() {
        return directory;
    }

    @Override
    public boolean isWritable() {
        return writable;
    }
}
