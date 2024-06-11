package com.chapter1_5.behavior.abstractFactory;

import com.chapter1_5.behavior.abstractFactory.basketball.BasketballTeamFactory;


public class SuperBasketballTeam {
    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new BasketballTeamFactory();
        Coach coach = projectTeamFactory.getCoach();
        Player player = projectTeamFactory.getPlayer();
        ProjectManager projectmanager = projectTeamFactory.getProjectManager();

        System.out.println(" Creating basketball soccer team");
        coach.trains();
        player.plays();
        projectmanager.manageProject();
    }

}
