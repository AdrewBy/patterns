package com.chapter1_5.creational.prototype1_0;

public class BasketballTeam extends Team{
    private int players;


    public BasketballTeam(int id, String name, String owner, int players) {
        super(id, name, owner);
        this.players=players;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }
    public BasketballTeam clone(){
        return new BasketballTeam(getId(),getName(),getOwner(), players);
    }

    @Override
    public String toString() {
        return "Basketball" + super.toString() +
                ", players=" + players
                 ;
    }
}
