package com.chapter1_5.creational.abstractFactory1_0.soccer;

import com.chapter1_5.creational.abstractFactory1_0.Coach;
import com.chapter1_5.creational.abstractFactory1_0.Player;
import com.chapter1_5.creational.abstractFactory1_0.ProjectTeamFactory;
import com.chapter1_5.creational.abstractFactory1_0.ProjectManager;

public class SoccerTeamFactory implements ProjectTeamFactory {
    @Override
    public Player getPlayer() {
        return new SoccerPlayer();
    }

    @Override
    public Coach getCoach() {
        return new SoccerCoach();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new SoccerPM();
    }
}
