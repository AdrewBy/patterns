package com.chapter1_5.creational.builder1_0;

public class Team {
    private String name;
    private League league;

    private int players;
    private int coaches;


    public void setName(String name) {
        this.name = name;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public void setCoaches(int coaches) {
        this.coaches = coaches;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", league=" + league +
                ", players=" + players +
                ", coaches=" + coaches +
                '}';
    }
}
