package com.chapter1_5.behavior.Mediator1_0;

public class ChatCommandsRunner {
    public static void main(String[] args) {
        ChatCommands commands = new ChatCommands();

        Player captain = new Captain(commands,"Captain");
        Player player1 = new SinglePlayer(commands,"Player 1");
        Player player2 = new SinglePlayer(commands,"Player 2");

        commands.setCaptain(captain);
        commands.addPlayerToGame(player1);
        commands.addPlayerToGame(player2);


        player1.sendMessage("Need help to protect basket");
        player2.sendMessage("I help him");
        captain.sendMessage("Roger that");
    }
}
