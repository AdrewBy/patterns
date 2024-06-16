package com.chapter1_5.structural.bridge1_0;

public class GameCreator {
    public static void main(String[] args) {
        Game[] games ={
                new HighLeagueGame(new BasketballPlayer()),
                new HighLeagueGame(new VolleyballPlayer()),
                new JuniorLeagueGame(new VolleyballPlayer())
        };
        for (Game game : games){
            game.playGame();
        }
    }
}
