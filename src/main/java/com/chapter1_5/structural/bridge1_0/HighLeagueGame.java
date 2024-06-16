package com.chapter1_5.structural.bridge1_0;

public class HighLeagueGame extends  Game{
    protected HighLeagueGame(Player player) {
        super(player);
    }



    @Override
    public void playGame() {
        System.out.println("HighLeague game is started...");
        player.play();
    }
}
