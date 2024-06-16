package com.chapter1_5.structural.facade1_0;

public class ExerciseTracker {
    private boolean activeExercise;
    public boolean isActiveExercise(){
        return activeExercise;
    }
    public void startExercise(){
        System.out.println("Exercise is active.");
        activeExercise = true;
    }
    public void finishExercise(){
        System.out.println("Exercise is not active.");
        activeExercise = false;
    }
}
