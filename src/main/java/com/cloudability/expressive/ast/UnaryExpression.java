package com.cloudability.expressive.ast;

public class UnaryExpression extends Expression {

    private final Expression expression;
    private final Operator operator;

    public UnaryExpression(Expression expression, Operator operator) {
        this.expression = expression;
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return String.format("UnaryExpression(%s,%s)", expression, operator);
    }
    
}