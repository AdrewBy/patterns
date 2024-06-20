package com.chapter1_5.behavior.observer1_0;

import java.util.ArrayList;
import java.util.List;

public class MusicSite implements Observed {
    List<String> songs = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addSong(String song) {
        this.songs.add(song);
        notifyObservers();
    }

    public void removeSong(String song) {
        this.songs.remove(song);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.songs);
        }
    }
}
