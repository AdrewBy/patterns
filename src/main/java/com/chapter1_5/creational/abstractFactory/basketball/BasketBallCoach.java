package com.chapter1_5.creational.abstractFactory.basketball;

import com.chapter1_5.creational.abstractFactory.Coach;

public class BasketBallCoach implements Coach {
    @Override
    public void trains() {
        System.out.println("Basketball trains players");
    }
}
