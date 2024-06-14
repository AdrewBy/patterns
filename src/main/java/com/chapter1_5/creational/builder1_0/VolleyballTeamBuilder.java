package com.chapter1_5.creational.builder1_0;

public class VolleyballTeamBuilder implements TeamBuilder{
    private Team team;

    @Override
    public void createTeam() {
        team = new Team();
    }

    @Override
    public void buildName() {
        team.setName("VolleyballTeam");
    }

    @Override
    public void buildLeague() {
        team.setLeague(League.LOW);
    }

    @Override
    public void buildPlayers() {
        team.setPlayers(6);
    }

    @Override
    public void buildCoaches() {
        team.setCoaches(1);
    }

    @Override
    public Team getTeam() {
        return team;
    }
}
