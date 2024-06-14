package com.chapter1_5.creational.prototype1_0;

public class VolleyballTeam extends Team{
    private int players;


    public VolleyballTeam(int id, String name, String owner, int players) {
        super(id, name, owner);
        this.players=players;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public VolleyballTeam clone(){
        return new VolleyballTeam(getId(),getName(),getOwner(), players);
    }

    @Override
    public String toString() {
        return  super.toString() +"VolleyballTeam{" +
                "players=" + players +
                "} " ;
    }
}
