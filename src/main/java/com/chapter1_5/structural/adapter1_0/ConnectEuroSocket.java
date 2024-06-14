package com.chapter1_5.structural.adapter1_0;

public class ConnectEuroSocket implements DifferentPlugForSocket {
    public void plugIntoSocket() {
        System.out.println("Connecting the plug into the Euro socket ....");
    }

    public void plugOutSocket() {
        System.out.println("Disconnecting the plug out the Euro socket ....");
    }
}
