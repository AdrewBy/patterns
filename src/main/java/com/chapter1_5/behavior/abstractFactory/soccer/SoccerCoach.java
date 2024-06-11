package com.chapter1_5.behavior.abstractFactory.soccer;

import com.chapter1_5.behavior.abstractFactory.Coach;

public class SoccerCoach implements Coach {
    @Override
    public void trains() {
        System.out.println("SoccerCoach trains players");
    }
}
