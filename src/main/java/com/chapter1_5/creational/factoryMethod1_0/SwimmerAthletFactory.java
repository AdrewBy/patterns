package com.chapter1_5.creational.factoryMethod1_0;

public class SwimmerAthletFactory implements AthleteFactory{
    @Override
    public Athlete createAthlete() {
        return new Swimmer();
    }
}
