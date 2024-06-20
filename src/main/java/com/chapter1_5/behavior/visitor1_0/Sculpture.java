package com.chapter1_5.behavior.visitor1_0;

public class Sculpture implements ShowElement{
    @Override
    public void beCreated(Artist artist) {
        artist.create(this);
    }
}
