package com.chapter1_5.behavior.abstractFactory.basketball;

import com.chapter1_5.behavior.abstractFactory.ProjectManager;

public class BasketBallPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Basketball PM manages project");
    }
}
