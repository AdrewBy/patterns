package com.chapter1_5.creational.factoryMethod1_0;

public class RunnerAthleteFactory implements AthleteFactory{

    public Athlete createAthlete() {
        return new Runner();
    }
}

