package com.chapter1_5.behavior.interpreter1_0;

public class AddExpression implements Expression{

    Expression expression1;
    Expression expression2;

    public AddExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int interpret() {
        return expression1.interpret() + expression2.interpret();
    }
}
