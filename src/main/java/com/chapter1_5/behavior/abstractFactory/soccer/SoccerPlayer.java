package com.chapter1_5.behavior.abstractFactory.soccer;

import com.chapter1_5.behavior.abstractFactory.Player;

public class SoccerPlayer implements Player {
    @Override
    public void plays() {
        System.out.println("SoccerPlayer plays");
    }
}
