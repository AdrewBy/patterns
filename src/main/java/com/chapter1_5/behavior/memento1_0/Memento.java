package com.chapter1_5.behavior.memento1_0;

import java.util.Date;

public class Memento {
    private final String name;
    private final Date date;

    public Memento(String name) {
        this.name = name;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}

