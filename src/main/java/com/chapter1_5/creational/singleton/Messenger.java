package com.chapter1_5.creational.singleton;

public class Messenger {

    private static Messenger messenger;
    private static  String messageFile = "This is all messages. \n\n";

    public static synchronized Messenger getMessenger(){
        if (messenger == null){
            messenger = new Messenger();
        }
        return messenger;
    }
    private Messenger(){

    }
    public void addMessageInfo(String messageInfo){
        messageFile +=messageInfo + "\n";
    }
    public void showMessageInfo(){
        System.out.println(messageFile);
    }
}
