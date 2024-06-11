package com.chapter1_5.behavior.abstractFactory.basketball;

import com.chapter1_5.behavior.abstractFactory.Coach;
import com.chapter1_5.behavior.abstractFactory.Player;
import com.chapter1_5.behavior.abstractFactory.ProjectTeamFactory;
import com.chapter1_5.behavior.abstractFactory.ProjectManager;

public class BasketballTeamFactory implements ProjectTeamFactory {
    @Override
    public Player getPlayer() {
        return new BasketBallPlayer();
    }

    @Override
    public Coach getCoach() {
        return new BasketBallCoach();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BasketBallPM();
    }
}
