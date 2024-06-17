package com.chapter1_5.behavior.command1_0;

public class MarketRunner {

    public static void main(String[] args) {
        MarketStore marketStore=new MarketStore();
        Customer customer = new Customer(
                new BuyCommand(marketStore),
                new SellCommand(marketStore),
                new OrderCommand(marketStore),
                new CancelOrderCommand(marketStore)
        );

        customer.buyItem();
        customer.sellItem();
        customer.orderItem();
        customer.cancelOrder();

    }
}
