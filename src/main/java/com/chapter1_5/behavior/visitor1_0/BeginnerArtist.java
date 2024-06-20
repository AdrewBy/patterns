package com.chapter1_5.behavior.visitor1_0;

public class BeginnerArtist implements Artist{
    @Override
    public void create(ShowClass showClass) {
        System.out.println("Opens regular show");
    }

    @Override
    public void create(Sculpture sculpture) {
        System.out.println("Makes a simple sculpture");
    }

    @Override
    public void create(Picture picture) {
        System.out.println("Draws a simple picture");
    }
}
