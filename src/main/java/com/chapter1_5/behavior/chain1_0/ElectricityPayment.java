package com.chapter1_5.behavior.chain1_0;

public class ElectricityPayment extends Payment {
    public ElectricityPayment(Payment nextPayment) {
        super(nextPayment);
    }

    @Override
    protected boolean orderToPay(String message) {
        return message.contains("electricity");
    }
    @Override
    public void write() {
        System.out.println("You paid electricity bill...");
    }
}
