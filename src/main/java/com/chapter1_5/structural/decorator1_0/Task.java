package com.chapter1_5.structural.decorator1_0;

public class Task {
    public static void main(String[] args) {

        Player player = new ProPlayer(new MiddleLevelPlayer(new JuniorPlayer()));
        System.out.println(player.play());
    }
}
