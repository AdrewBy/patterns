package com.chapter1_5.structural.composite1_0;

public class GameRunner {
    public static void main(String[] args) {
        Team basketballteam = new Team("Basketball");
        Team volleyballTeam = new Team("VolleyballTeam");
        Team friendlyTeam= new Team("FriendlyTeam");

        Playable player1 =new BasketballPlayer("Bob");
        Playable player2 =new BasketballPlayer("Tom");

        Playable player3 =new VolleyballPlayer("Jack");
        Playable player4 =new VolleyballPlayer("Smith");
        Playable player5 =new AmateurPlayer("Michail");

        basketballteam.addPlayer(player1);
        basketballteam.addPlayer(player2);

        volleyballTeam.addPlayer(player3);
        volleyballTeam.addPlayer(player4);


        friendlyTeam.addPlayer(player5);
        friendlyTeam.addPlayer(volleyballTeam);
        friendlyTeam.addPlayer(basketballteam);


        basketballteam.play();
        System.out.println("=============");
        friendlyTeam.play();
        System.out.println("=============");
    }
}
