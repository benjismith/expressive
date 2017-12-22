package com.cloudability.expressive.ast;

public class BinaryExpression extends Expression {

    private final Expression leftSide;
    private final Operator operator;
    private final Expression rightSide;

    public BinaryExpression(Expression leftSide, Operator operator, Expression rightSide) {
        this.leftSide = leftSide;
        this.operator = operator;
        this.rightSide = rightSide;
    }

    public Expression getLeftSide() {
        return leftSide;
    }

    public Operator getOperator() {
        return operator;
    }

    public Expression getRightSide() {
        return rightSide;
    }

    @Override
    public String toString() {
        return String.format("BinaryExpression(%s,%s,%s)", leftSide, operator, rightSide);
    }
    
}