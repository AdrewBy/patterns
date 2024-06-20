package com.chapter1_5.behavior.Strategy1_0;

public class SportsmanTrainRunner {
    public static void main(String[] args) {

        Sportsman sportsman = new Sportsman();

        sportsman.setActivity(new Jumping());
        sportsman.executeActivity();

        sportsman.setActivity(new Squatting());
        sportsman.executeActivity();
    }
}
