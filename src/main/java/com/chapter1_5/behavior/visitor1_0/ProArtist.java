package com.chapter1_5.behavior.visitor1_0;

public class ProArtist implements Artist{
    @Override
    public void create(ShowClass showClass) {
        System.out.println("Creates awesome show");
    }

    @Override
    public void create(Sculpture sculpture) {
        System.out.println("Creates a sculpture masterpiece ");
    }

    @Override
    public void create(Picture picture) {
        System.out.println("Creates a picture masterpiece ");
    }
}
