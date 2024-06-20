package com.chapter1_5.behavior.observer1_0;

import java.util.List;

public class Subscriber implements Observer {
     String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> songs) {
        System.out.println("Dear " + name + "\nWe have some changes in songs:\n" +
                songs + "\n=================================================\n");
    }
}
