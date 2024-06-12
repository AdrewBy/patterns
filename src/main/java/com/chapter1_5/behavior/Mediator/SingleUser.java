package com.chapter1_5.behavior.Mediator;

public class SingleUser implements User {
    Chat chat;
    String name;

    public SingleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message + ".");
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }
}
