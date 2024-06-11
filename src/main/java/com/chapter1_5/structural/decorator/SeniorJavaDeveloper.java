package com.chapter1_5.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCadeReview(){
        return "Make code review";
    }
    public String makeJob(){
        return super.makeJob()+makeCadeReview();
    }
}
