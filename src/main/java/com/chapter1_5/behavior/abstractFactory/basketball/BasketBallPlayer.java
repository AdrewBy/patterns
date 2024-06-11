package com.chapter1_5.behavior.abstractFactory.basketball;

import com.chapter1_5.behavior.abstractFactory.Player;

public class BasketBallPlayer implements Player {
    @Override
    public void plays() {
        System.out.println("Basketball players plays");
    }
}
