package com.chapter1_5.behavior.template;

public class WebSiteRunner {
    public static void main(String[] args) {
        WebSiteTemplate welcomePage = new WelcomePage();
        WebSiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n==========================\n");

        newsPage.showPage();
    }
}
