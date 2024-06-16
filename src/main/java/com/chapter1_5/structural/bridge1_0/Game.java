package com.chapter1_5.structural.bridge1_0;

public abstract class Game {
    protected Player player;

     protected Game(Player  player) {
        this.player = player;
    }
    public abstract void playGame();
}
