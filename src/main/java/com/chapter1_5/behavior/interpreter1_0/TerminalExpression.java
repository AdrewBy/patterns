package com.chapter1_5.behavior.interpreter1_0;

public class TerminalExpression implements Expression{
    private int number;

    public TerminalExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
