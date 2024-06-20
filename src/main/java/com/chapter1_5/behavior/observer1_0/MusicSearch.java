package com.chapter1_5.behavior.observer1_0;

public class MusicSearch {
    public static void main(String[] args) {
        MusicSite musicSite = new MusicSite();

        musicSite.addSong("Song1");
        musicSite.addSong("Song2");

        Observer firstSubscriber = new Subscriber("First man");
        Observer secondSubscriber = new Subscriber("Second man");

        musicSite.addObserver(firstSubscriber);
        musicSite.addObserver(secondSubscriber);

        musicSite.addSong("Song3");

        musicSite.removeSong("Song2");

    }
}
