package com.chapter1_5.behavior.template;

public abstract class WebSiteTemplate {

    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
