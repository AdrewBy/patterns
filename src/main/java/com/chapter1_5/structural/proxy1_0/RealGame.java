package com.chapter1_5.structural.proxy1_0;

public class RealGame implements Game{

    private String commandToStart;

    public RealGame(String commandToStart) {
        this.commandToStart = commandToStart;
        checkStatusCommandToStart();
    }

    public void checkStatusCommandToStart(){
        System.out.println("The game is ready to start.");
    }
    @Override
    public void start() {
        System.out.println("Starting the game.");
    }
}
