package com.chapter1_5.behavior.command1_0;

public class CancelOrderCommand implements Command{
    MarketStore marketStore;

    public CancelOrderCommand(MarketStore marketStore) {
        this.marketStore = marketStore;
    }

    @Override
    public void execute() {
        marketStore.cancelOrder();
    }
}
