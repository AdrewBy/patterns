package com.chapter1_5.behavior.factoryMethod;

public class SwimmerAthletFactory implements AthleteFactory{
    @Override
    public Athlete createAthlete() {
        return new Swimmer();
    }
}
