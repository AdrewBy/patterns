package com.chapter1_5.structural.composite1_0;

public class AmateurPlayer implements Playable{
    private String name;

    public AmateurPlayer(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Amateur player " + name + " is playing in game...");

    }
}
