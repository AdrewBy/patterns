package com.chapter1_5.creational.builder1_0;

public class BuildTeamRunner {
    public static void main(String[] args) {

        Director director = new Director();
        director.setTeamBuilder(new BasketballTeamBuilder());
        Team team = director.buildTeam();
        System.out.println(team);

    }
}
