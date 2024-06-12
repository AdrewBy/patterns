package com.chapter1_5.creational.abstractFactory.basketball;

import com.chapter1_5.creational.abstractFactory.Player;

public class BasketBallPlayer implements Player {
    @Override
    public void plays() {
        System.out.println("Basketball players plays");
    }
}
