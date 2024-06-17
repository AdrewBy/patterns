package com.chapter1_5.structural.flyweight1_0;

import java.util.ArrayList;
import java.util.List;

public class GameRunner {
    public static void main(String[] args) {

        PlayerFactory playerFactory = new PlayerFactory();
        List<Player> players = new ArrayList<>();

        players.add(playerFactory.getPlayerBySpeciality("basketball"));
        players.add(playerFactory.getPlayerBySpeciality("basketball"));
        players.add(playerFactory.getPlayerBySpeciality("basketball"));
        players.add(playerFactory.getPlayerBySpeciality("basketball"));

        players.add(playerFactory.getPlayerBySpeciality("volleyball"));
        players.add(playerFactory.getPlayerBySpeciality("volleyball"));
        players.add(playerFactory.getPlayerBySpeciality("volleyball"));

        for (Player player : players){
            player.play();
        }
    }
}
