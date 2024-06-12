package com.chapter1_5.creational.factoryMethod;

public class SwimmerAthletFactory implements AthleteFactory{
    @Override
    public Athlete createAthlete() {
        return new Swimmer();
    }
}