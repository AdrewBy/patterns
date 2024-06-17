package com.chapter1_5.behavior.command1_0;

public class SellCommand implements Command {
    MarketStore marketStore;

    public SellCommand(MarketStore marketStore) {
        this.marketStore = marketStore;
    }

    @Override
    public void execute() {
        marketStore.sell();
    }
}
