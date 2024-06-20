package com.chapter1_5.behavior.state1_0;

public class Sportsman {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity(){
        if (activity instanceof Jumping){
            setActivity(new Squatting());
        } else if (activity instanceof Squatting) {
            setActivity(new Pushuping());
        } else if ( activity instanceof Pushuping) {
            setActivity(new Jumping());
        }
    }

    public void justDoIt(){
        activity.justDoIt();
    }
}
