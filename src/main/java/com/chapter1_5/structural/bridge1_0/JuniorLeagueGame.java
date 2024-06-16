package com.chapter1_5.structural.bridge1_0;

public class JuniorLeagueGame extends Game{
    protected JuniorLeagueGame(Player player) {
        super(player);
    }

    @Override
    public void playGame() {
        System.out.println("JuniorLeague game is started...");
        player.play();
    }
}
