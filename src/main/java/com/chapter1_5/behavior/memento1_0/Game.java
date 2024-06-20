package com.chapter1_5.behavior.memento1_0;

import java.util.Date;

public class Game {
    private String name;
    private Date date;

    public void setNameAndDate(String name) {
        this.name = name;
        this.date = new Date();
    }

    public Memento save() {
        return new Memento(name);
    }
    public void load(Memento memento){
        name = memento.getName();
        date = memento.getDate();
    }

    @Override
    public String toString() {
        return "Game: " +
                "\nName: " + name +
                "\nDate: " + date + "\n";
    }


}
