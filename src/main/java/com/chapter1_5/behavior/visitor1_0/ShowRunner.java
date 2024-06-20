package com.chapter1_5.behavior.visitor1_0;

public class ShowRunner {
    public static void main(String[] args) {
        Show show = new Show();

        Artist beginner = new BeginnerArtist();
        Artist pro = new ProArtist();

        System.out.println("Beginner in action ...");
        show.beCreated(beginner);
        System.out.println("=====");
        System.out.println("Pro in action ...");
        show.beCreated(pro);
    }
}
