package com.chapter1_5.structural.adapter1_0;

public class ConnectUsaSocket implements DifferentPlugForSocket {
    public void plugIntoSocket() {
        System.out.println("Connecting the plug into the  USA socket ....");
    }

    public void plugOutSocket() {
        System.out.println("Disconnecting the plug out the  USA socket ....");
    }
}
