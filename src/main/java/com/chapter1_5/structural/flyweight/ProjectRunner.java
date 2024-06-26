package com.chapter1_5.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("C++"));
        developers.add(developerFactory.getDeveloperBySpecialty("C++"));
        developers.add(developerFactory.getDeveloperBySpecialty("C++"));

        for (Developer developer: developers){
            developer.writeCode();
        }
    }
}
