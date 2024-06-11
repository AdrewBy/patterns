package com.chapter1_5.behavior.abstractFactory.soccer;

import com.chapter1_5.behavior.abstractFactory.Coach;
import com.chapter1_5.behavior.abstractFactory.Player;
import com.chapter1_5.behavior.abstractFactory.ProjectTeamFactory;
import com.chapter1_5.behavior.abstractFactory.ProjectManager;

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
