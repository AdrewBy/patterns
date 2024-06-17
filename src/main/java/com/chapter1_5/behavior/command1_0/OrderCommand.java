package com.chapter1_5.behavior.command1_0;

public class OrderCommand implements Command{
    MarketStore marketStore;

    public OrderCommand(MarketStore marketStore) {
        this.marketStore = marketStore;
    }

    @Override
    public void execute() {
        marketStore.order();
    }
}
