package com.chapter1_5.creational.abstractFactory1_0.basketball;

import com.chapter1_5.creational.abstractFactory1_0.Coach;

public class BasketBallCoach implements Coach {
    @Override
    public void trains() {
        System.out.println("Basketball trains players");
    }
}
