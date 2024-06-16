package com.chapter1_5.structural.decorator1_0;

public class MiddleLevelPlayer extends PlayerDecorator{
    public MiddleLevelPlayer(Player player) {
        super(player);
    }
    public String takePartInHighLevelTournament(){
        return "Takes part in tournament. ";
    }

    @Override
    public String play() {
        return super.play() + takePartInHighLevelTournament();
    }
}
