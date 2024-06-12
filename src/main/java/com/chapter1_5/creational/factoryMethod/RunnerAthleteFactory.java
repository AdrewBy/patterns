package com.chapter1_5.creational.factoryMethod;

public class RunnerAthleteFactory implements AthleteFactory{

    public Athlete createAthlete() {
        return new Runner();
    }
}

