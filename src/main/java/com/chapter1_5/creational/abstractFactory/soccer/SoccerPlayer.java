package com.chapter1_5.creational.abstractFactory.soccer;

import com.chapter1_5.creational.abstractFactory.Player;

public class SoccerPlayer implements Player {
    @Override
    public void plays() {
        System.out.println("SoccerPlayer plays");
    }
}
