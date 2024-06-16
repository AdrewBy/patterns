package com.chapter1_5.structural.facade1_0;

public class ExerciseRunner {
    public static void main(String[] args) {

        ExerciseFlow exerciseFlow = new ExerciseFlow();
        exerciseFlow.makeBodyStronger();
        System.out.println("====================");
        exerciseFlow.getRelaxAfterExercise();
    }
}
