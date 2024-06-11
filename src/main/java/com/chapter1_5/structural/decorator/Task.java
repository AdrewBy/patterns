package com.chapter1_5.structural.decorator;

public class Task {

    public static void main(String[] args) {

        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
