package com.chapter1_5.structural.facade1_0;

public class Sportsman {
    public void doExercise(ExerciseTracker exerciseTracker){
        if (exerciseTracker.isActiveExercise()){
            System.out.println("Sportsman is training  ...");
        }else {
            System.out.println("Sportsman is relaxing ....");
        }
    }
}
