package com.chapter1_5.behavior.template1_0;

import java.util.Date;

public abstract class ScorePanelTemplate {

    Date date;
    public final void showScore(){
        System.out.println("Score:");
        showScoreContent();
        System.out.println(date = new Date());
    }

    public abstract void showScoreContent();
}
