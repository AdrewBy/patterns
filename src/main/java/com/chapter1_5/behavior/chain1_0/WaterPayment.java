package com.chapter1_5.behavior.chain1_0;

public class WaterPayment extends Payment {
    public WaterPayment(Payment nextAutoPayment) {
        super(nextAutoPayment);
    }


    @Override
    protected boolean orderToPay(String message) {
        return message.contains("water");
    }
    @Override
    public void write() {
        System.out.println("You paid water bill...");
    }
}
