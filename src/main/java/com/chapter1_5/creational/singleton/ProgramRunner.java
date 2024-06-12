package com.chapter1_5.creational.singleton;

public class ProgramRunner {

    public static void main(String[] args) {
        Messenger.getMessenger().addMessageInfo("First message ...");
        Messenger.getMessenger().addMessageInfo("Second message ...");
        Messenger.getMessenger().addMessageInfo("Third message ...");
        Messenger.getMessenger().showMessageInfo();
    }
}
