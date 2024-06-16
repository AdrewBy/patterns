package com.chapter1_5.structural.composite1_0;

import java.util.ArrayList;
import java.util.List;

public class Team implements Playable {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    List<Playable> players = new ArrayList<>();

    public void removePlayer(Playable player) {
        players.remove(player);
    }

    public void addPlayer(Playable player) {
        players.add(player);
    }

//    @Override
//    public void play() {
//        System.out.print( " Players take a part in game: " + "\n");
//        for (Playable member : players) {
//            if (member instanceof FriendlyTeam) {
//
//                //           System.out.print(((Team) member).getName() +" and " + name + " plays game with players: " + "\n");
//                System.out.print(((FriendlyTeam) member).getName() + " and " + name + " plays game together. " + "\n");
//            }
//        }
        //   System.out.println("plays game with players:");
//        for (Playable member : players) {
            //          if (!(member instanceof Team)) {
//           member.play();
            //       }
//        }
 //   }
    @Override
    public void play() {

        System.out.print( "  "+name + " players take a part in game: " + "\n");
        for (Playable player : players){
            player.play();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name +
                '}';
    }
}
