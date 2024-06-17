package com.chapter1_5.structural.proxy1_0;

public class GameRunner {

    public static void main(String[] args) {
        Game game = new ProxyGame("Ready");
        game.start();
    }
}
