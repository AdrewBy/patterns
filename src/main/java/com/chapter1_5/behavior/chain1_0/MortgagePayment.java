package com.chapter1_5.behavior.chain1_0;

public class MortgagePayment extends Payment {


    public MortgagePayment(Payment nextAutoPayment) {
        super(nextAutoPayment);
    }



    @Override
    protected boolean orderToPay(String message) {
        return message.contains("mortgage");
    }
    @Override
    public void write() {
        System.out.println("You paid mortgage bill...");
    }
}
