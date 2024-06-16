package com.chapter1_5.structural.decorator1_0;

public class PlayerDecorator implements Player{
    Player player;

    public PlayerDecorator(Player player) {
        this.player = player;
    }

    @Override
    public String play() {
        return player.play();

    }
}
