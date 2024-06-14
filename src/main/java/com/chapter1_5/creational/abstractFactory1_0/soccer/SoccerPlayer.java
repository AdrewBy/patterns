package com.chapter1_5.creational.abstractFactory1_0.soccer;

import com.chapter1_5.creational.abstractFactory1_0.Player;

public class SoccerPlayer implements Player {
    @Override
    public void plays() {
        System.out.println("SoccerPlayer plays");
    }
}
