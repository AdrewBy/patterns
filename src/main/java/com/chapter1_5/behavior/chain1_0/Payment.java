package com.chapter1_5.behavior.chain1_0;

public abstract class Payment {
    private Payment nextPayment;

    public Payment(Payment nextPayment) {
        this.nextPayment = nextPayment;
    }

    public void setNextPayment(Payment nextPayment) {
        this.nextPayment = nextPayment;
    }

    public void payManager(String message) {
        if (orderToPay(message)) {
            write();
        } else if (nextPayment != null) {
            nextPayment.payManager(message);
        }else {
            System.out.println("No found for message: " + message);
        }
    }
    protected abstract boolean orderToPay(String message);
    public abstract void write();

}
