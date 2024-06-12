package com.chapter1_5.creational.builder;

public abstract class WebsiteBuilder {
    Website website;

    void creatWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite() {
        return website;
    }
}
