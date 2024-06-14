package com.chapter1_5.creational.builder1_0;

public class Director {

    TeamBuilder teamBuilder;

    public void setTeamBuilder(TeamBuilder teamBuilder) {
        this.teamBuilder = teamBuilder;
    }

    public Team buildTeam() {
        teamBuilder.createTeam();
        teamBuilder.buildName();
        teamBuilder.buildLeague();
        teamBuilder.buildPlayers();
        teamBuilder.buildCoaches();
        return teamBuilder.getTeam();
    }
}
