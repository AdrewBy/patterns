package com.chapter1_5.structural.composite1_0;

public class VolleyballPlayer implements Playable {
    private  String name;

    public VolleyballPlayer(String name) {
        this.name =name;
    }

    @Override
    public void play() {
        System.out.println("Volleyball player is playing game...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
