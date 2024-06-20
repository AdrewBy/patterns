package com.chapter1_5.creational.factoryMethod1_0;

public class Program {
    public static void main(String[] args) {
        AthleteFactory athleteFactory = createAthleteBySpecialty("swimmer");
        Athlete athlete = athleteFactory.createAthlete();
        athlete.actionAthlete();
    }
    static AthleteFactory createAthleteBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("runner")){
            return new RunnerAthleteFactory();
        } else if (specialty.equalsIgnoreCase("swimmer")) {
            return new SwimmerAthletFactory();
        }else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
