package com.chapter1_5.behavior.interpreter1_0;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression expr1 = new TerminalExpression(3);
        Expression expr2 = new TerminalExpression(5);
        Expression expr3 = new AddExpression(expr1, expr2);
        Expression expr4 = new TerminalExpression(2);
        Expression expr5 = new MinusExpression(expr3, expr4);

        System.out.println("(3 + 5) - 2 = " + expr5.interpret());

    }

}
