package com.chapter1_5.structural.flyweight1_0;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    private static final Map<String, Player> players = new HashMap<>();

    public Player getPlayerBySpeciality(String speciality){
        Player player = players.get(speciality);

        if (player == null){
            switch (speciality){
                case "basketball":
                    System.out.println("Invite basketball player ...");
                    player = new BasketballPlayer();
                    break;
                case "volleyball":
                    System.out.println("Invite volleyball player...");
                    player=new VolleyballPlayer();
            }
            players.put(speciality, player);
        }
        return player;
    }
}
