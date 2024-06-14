package com.chapter1_5.creational.abstractFactory1_0.basketball;

import com.chapter1_5.creational.abstractFactory1_0.Player;

public class BasketBallPlayer implements Player {
    @Override
    public void plays() {
        System.out.println("Basketball players plays");
    }
}
