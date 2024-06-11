package com.chapter1_5.behavior.abstractFactory.soccer;

import com.chapter1_5.behavior.abstractFactory.ProjectManager;

public class SoccerPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Soccer PM manages soccer project");
    }
}
