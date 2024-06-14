package com.chapter1_5.creational.builder1_0;

public interface TeamBuilder {

    void createTeam();

    void buildName();

    void buildLeague();

    void buildPlayers();

    void buildCoaches();

    Team getTeam();
}
