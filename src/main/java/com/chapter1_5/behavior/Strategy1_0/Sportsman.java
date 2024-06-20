package com.chapter1_5.behavior.Strategy1_0;

public class Sportsman {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
