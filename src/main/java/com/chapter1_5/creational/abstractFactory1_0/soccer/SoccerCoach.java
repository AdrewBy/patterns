package com.chapter1_5.creational.abstractFactory1_0.soccer;

import com.chapter1_5.creational.abstractFactory1_0.Coach;

public class SoccerCoach implements Coach {
    @Override
    public void trains() {
        System.out.println("SoccerCoach trains players");
    }
}
