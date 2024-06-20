package com.chapter1_5.behavior.state1_0;

public class SportsmanTrainRunner {
    public static void main(String[] args) {
        Activity activity = new Jumping();
        Sportsman sportsman = new Sportsman();

        sportsman.setActivity(activity);

        for (int i = 0; i<6; i++){
            sportsman.justDoIt();
            sportsman.changeActivity();
        }
    }
}
