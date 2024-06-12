package com.chapter1_5.behavior.visitor;

public interface Developer {

    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);
}
