package com.chapter1_5.behavior.command1_0;

public class BuyCommand implements Command{
    MarketStore marketStore;

    public BuyCommand(MarketStore marketStore) {
        this.marketStore = marketStore;
    }

    @Override
    public void execute() {
        marketStore.buy();
    }
}
