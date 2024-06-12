package com.chapter1_5.behavior.command;

public class SelectCommand implements Command{
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
