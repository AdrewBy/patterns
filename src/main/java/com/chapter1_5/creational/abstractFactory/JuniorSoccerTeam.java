package com.chapter1_5.creational.abstractFactory;

import com.chapter1_5.creational.abstractFactory.soccer.SoccerTeamFactory;

public class JuniorSoccerTeam {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new SoccerTeamFactory();
        Coach coach = projectTeamFactory.getCoach();
        Player player = projectTeamFactory.getPlayer();
        ProjectManager projectmanager = projectTeamFactory.getProjectManager();

        System.out.println(" Creating junior soccer team");
        coach.trains();
        player.plays();
        projectmanager.manageProject();
    }
}
