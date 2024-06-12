package com.chapter1_5.behavior.visitor;

public class ProjectClass implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
developer.create(this);
    }
}
