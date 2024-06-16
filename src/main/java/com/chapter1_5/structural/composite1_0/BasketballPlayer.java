package com.chapter1_5.structural.composite1_0;

public class BasketballPlayer implements Playable {
    private String name;

    public BasketballPlayer(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Basketball player " + name + " is playing in game...");
    }
}
