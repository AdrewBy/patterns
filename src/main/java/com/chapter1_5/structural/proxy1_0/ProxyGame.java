package com.chapter1_5.structural.proxy1_0;

public class ProxyGame implements Game{

    private String commandToStart;

    private RealGame realGame;

    public ProxyGame(String commandToStart) {
        this.commandToStart = commandToStart;
    }

    @Override
    public void start() {
        if (realGame==null){
            realGame = new RealGame(commandToStart);
        }
        realGame.start();
    }
}
