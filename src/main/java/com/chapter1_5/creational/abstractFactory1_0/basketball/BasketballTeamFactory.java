package com.chapter1_5.creational.abstractFactory1_0.basketball;

import com.chapter1_5.creational.abstractFactory1_0.Coach;
import com.chapter1_5.creational.abstractFactory1_0.Player;
import com.chapter1_5.creational.abstractFactory1_0.ProjectTeamFactory;
import com.chapter1_5.creational.abstractFactory1_0.ProjectManager;

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
