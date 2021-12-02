package com.javarush.task.task30.task3008.Чат_8.right;

import java.io.Serializable;

public class Message implements Serializable {
    private final MessageType type;
    private final String data;

    public Message(MessageType type) {
        this.type = type;
        this.data = null;
    }


    public Message(MessageType type, String data) {
        this.type = type;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public MessageType getType() {
        return type;
    }
}
