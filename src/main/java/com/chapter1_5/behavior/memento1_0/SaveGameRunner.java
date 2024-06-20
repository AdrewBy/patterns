package com.chapter1_5.behavior.memento1_0;

public class SaveGameRunner {
    public static void main(String[] args) {
        DataBaseForSavings dbs = new DataBaseForSavings();
        Game game = new Game();

        System.out.println("Creating new game. Name First part of adventure");
        game.setNameAndDate("First part of adventure");

        System.out.println(game);

        System.out.println("Saving current game to DB..");
        dbs.setSave(game.save());

        System.out.println("Gaming some time...");
        System.out.println("Updating result of game after saving 'First part of adventure'");

        game.setNameAndDate("Second part of adventure");
        System.out.println(game);
        System.out.println("Something went wrong ...");
        System.out.println("Rolling back to 'First part of adventure'");
        System.out.println("=================");
        game.load(dbs.getSave());

        System.out.println("Game after rollback");
        System.out.println(game);

    }
}
