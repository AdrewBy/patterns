package com.chapter1_5.structural.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("developer is solving problems ...");
        }else {
            System.out.println("Developer is reading Habrahabr ....");
        }
    }
}
