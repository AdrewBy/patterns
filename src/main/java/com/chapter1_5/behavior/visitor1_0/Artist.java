package com.chapter1_5.behavior.visitor1_0;

public interface Artist {
    void create(ShowClass showClass);
    void create(Sculpture sculpture);
    void create(Picture picture);
}
