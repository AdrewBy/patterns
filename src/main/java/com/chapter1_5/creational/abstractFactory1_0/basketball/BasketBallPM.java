package com.chapter1_5.creational.abstractFactory1_0.basketball;

import com.chapter1_5.creational.abstractFactory1_0.ProjectManager;

public class BasketBallPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Basketball PM manages project");
    }
}
