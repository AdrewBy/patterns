package com.chapter1_5.behavior.abstractFactory.basketball;

import com.chapter1_5.behavior.abstractFactory.Coach;

public class BasketBallCoach implements Coach {
    @Override
    public void trains() {
        System.out.println("Basketball trains players");
    }
}
