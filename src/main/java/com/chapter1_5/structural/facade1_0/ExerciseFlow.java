package com.chapter1_5.structural.facade1_0;

public class ExerciseFlow {
    Water water = new Water();
    ExerciseTracker exerciseTracker = new ExerciseTracker();
    Sportsman sportsman = new Sportsman();

    public void makeBodyStronger(){
        exerciseTracker.startExercise();
        sportsman.doExercise(exerciseTracker);
        water.drinkWater();

    }
    public void getRelaxAfterExercise(){
        exerciseTracker.finishExercise();
        sportsman.doExercise(exerciseTracker);
    }


}
