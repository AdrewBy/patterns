package com.chapter1_5.structural.decorator1_0;



public class ProPlayer extends PlayerDecorator {

    public ProPlayer(Player player) {
        super(player);
    }

    public String canTeachOtherPlayers(){
        return "Can teach other players. ";
    }
    public String play(){
        return super.play() + canTeachOtherPlayers();
    }
}
