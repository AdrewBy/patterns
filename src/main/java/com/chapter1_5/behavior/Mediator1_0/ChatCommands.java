package com.chapter1_5.behavior.Mediator1_0;

import java.util.ArrayList;
import java.util.List;

public class ChatCommands implements Chat {
    Player captain;
    List<Player> players = new ArrayList<>();

    public void setCaptain(Player captain) {
        this.captain = captain;
    }
    public void addPlayerToGame(Player player){
        this.players.add(player);
    }

    @Override
    public void sendMessage(String message, Player player) {
        for (Player p : players){
            if (p !=player){
                p.getMessage(message);
            }
        }
       captain.getMessage(message);

    }

}
