package com.chapter1_5.creational.abstractFactory.basketball;

import com.chapter1_5.creational.abstractFactory.Coach;
import com.chapter1_5.creational.abstractFactory.Player;
import com.chapter1_5.creational.abstractFactory.ProjectTeamFactory;
import com.chapter1_5.creational.abstractFactory.ProjectManager;

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
