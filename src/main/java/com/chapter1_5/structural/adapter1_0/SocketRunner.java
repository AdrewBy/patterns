package com.chapter1_5.structural.adapter1_0;

public class SocketRunner {
    public static void main(String[] args) {
        Socket socket1 = new AdapterUsaSocket();
        Socket socket2 = new AdapterEuroSocket();

        socket1.plugIn();
        socket1.plugOut();
        System.out.println("======================");
        socket2.plugIn();
        socket2.plugOut();
    }
}
