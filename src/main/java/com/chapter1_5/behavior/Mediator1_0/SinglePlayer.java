package com.chapter1_5.behavior.Mediator1_0;

public class SinglePlayer implements Player{

    Chat game;
    String name;

    public SinglePlayer(Chat game, String name) {
        this.game = game;
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
        game.sendMessage(message, this);
    }
}
