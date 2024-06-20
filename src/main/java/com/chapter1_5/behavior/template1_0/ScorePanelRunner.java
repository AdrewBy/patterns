package com.chapter1_5.behavior.template1_0;

public class ScorePanelRunner {
    public static void main(String[] args) throws InterruptedException {
        ScorePanelTemplate soccerPan = new SoccerScore();
        ScorePanelTemplate tennisPan = new TennisScore();



        soccerPan.showScore();
        System.out.println("=====");
        Thread.sleep(1000);
        tennisPan.showScore();
    }
}
