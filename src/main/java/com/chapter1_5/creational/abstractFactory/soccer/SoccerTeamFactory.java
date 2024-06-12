package com.chapter1_5.creational.abstractFactory.soccer;

import com.chapter1_5.creational.abstractFactory.Coach;
import com.chapter1_5.creational.abstractFactory.Player;
import com.chapter1_5.creational.abstractFactory.ProjectTeamFactory;
import com.chapter1_5.creational.abstractFactory.ProjectManager;

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
