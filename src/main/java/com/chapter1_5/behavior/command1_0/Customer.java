package com.chapter1_5.behavior.command1_0;

public class Customer {
    Command buy;
    Command sell;
    Command order;
    Command cancelOrder;

    public Customer(Command buy, Command sell, Command order, Command cancelOrder) {
        this.buy = buy;
        this.sell = sell;
        this.order = order;
        this.cancelOrder = cancelOrder;
    }

    public void buyItem() {
        buy.execute();
    }

    public void sellItem() {
        sell.execute();
    }

    public void orderItem() {
        order.execute();
    }

    public void cancelOrder() {
        cancelOrder.execute();
    }
}
